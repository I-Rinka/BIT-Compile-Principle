package bit.minisys.minicc.ncgen;

import bit.minisys.minicc.ncgen.BasicBlockInfo.FunctionContent;
import bit.minisys.minicc.ncgen.IR.Symbol.*;
import bit.minisys.minicc.parser.ast.*;
import bit.minisys.minicc.semantic.SemanticErrorHandler;
import bit.minisys.minicc.ncgen.IR.IRInstruction.*;

import java.util.*;

/*
    目前支持情况:
    语义检查:
    1. 未定义检测 ✅
    2. 重复定义 ✅
    3. 未在循环内使用break ✅
    4. 函数调用参数不匹配 ✅
    5. 操作类型不匹配 ✅
    6. 数组越界 ✅
    7. goto标签不存在 ✅
    8. 函数缺少return ✅

    中间代码生成:
    1. 全局变量声明 ✅
    2. 局部变量声明 ✅
    3. 递归作用域 ✅
    4. 无名字符串 ✅
    6. 函数调用 ✅
    7. 运算操作 ✅
    8. 循环语句 ✅
    9. 选择语句 ✅
    10. 跳转语句 ✅
    11. 拉链反填 ✅

 */

public class WzcLLVM
{
    ASTCompilationUnit ASTRoot = null;

    //为了有scope的支持，需要使用栈
    private final Sy_Table SymbolTable;

    private LinkedList<IR_instruction> InsBuffer;
    private final HashMap<String, String> OperatorMap;

    private HashMap<String, String> RegDataBase;

    //因为查错的状态是全局性的，因此需要在外面
    boolean now_function_return_exist = false;//用于检测函数是否有return
    String now_function_type_C = null; //用于函数返回类型

    //使用break或者continue时的标号
    private final LinkedList<IR_branch> break_statements_buffer;//给break语句的标号进行反填,日后可改成拉链反填
    private int now_continue_position = 0;

    private int register_counter = 0; //虚拟寄存器以及基本块的值
    private int iteration_counter = 0;//目前循环的层数，用于检测break是否在循环内
    private int nameless_str_counter = 0;//用于无名字符串的声明

    private boolean is_condition_expression = false;//条件判断expression的行为有些不一样

    private final LinkedList<IR_instruction> Global_declar;

    public void AddLibFunction(Sy_Func func)
    {
        SymbolTable.PutFunctionDec(func);
    }

    LinkedList<FunctionContent> functions;

    public LinkedList<FunctionContent> GetFunctions()
    {
        return functions;
    }

    public String GetIRCode()
    {
        StringBuilder IR_Code = new StringBuilder();
        for (IR_instruction dec :
                Global_declar)
        {
            IR_Code.append(dec.toString());
        }

        //添加global
        for (FunctionContent function :
                functions)
        {
            IR_Code.append(function.GetFunctionIRString());
        }

        return IR_Code.toString();
    }

    LinkedList<IR_instruction> GetGlobalDeclaration()
    {
        return Global_declar;
    }

    public void Run()
    {
        for (ASTNode item : ASTRoot.items)
        {
            if (item instanceof ASTDeclaration)
            {
                //todo 重新添加对全局变量的支持
//                GlobalDeclarationHandler((ASTDeclaration) item);
            }
            else if (item instanceof ASTFunctionDefine)
            {
                functions.add(FunctionHandler((ASTFunctionDefine) item));
            }
        }
    }

    void StatementHandler(ASTStatement statement)
    {
        if (statement instanceof ASTCompoundStatement)
        {
            //准备递归调用，不过在这之前，先新建一个环境
            SymbolTable.EnterNewScope();
            CompoundStatementHandler((ASTCompoundStatement) statement);
            SymbolTable.ExitScope();
        }
        else if (statement instanceof ASTExpressionStatement)
        {
            ASTExpressionStatement expressionStatement = (ASTExpressionStatement) statement;
            ExpressionHandler(expressionStatement.exprs.get(0));
        }
        else if (statement instanceof ASTReturnStatement)
        {
            ReturnStatementHandler((ASTReturnStatement) statement);
        }
        else if (statement instanceof ASTSelectionStatement)
        {
            SelectionStatementHandler((ASTSelectionStatement) statement);
        }
        else if (statement instanceof ASTIterationDeclaredStatement)
        {
            iteration_counter++;

            SymbolTable.EnterNewScope();

            DcIterationStatementHandler((ASTIterationDeclaredStatement) statement);

            SymbolTable.ExitScope();

            iteration_counter--;
        }
        else if (statement instanceof ASTIterationStatement)
        {
            iteration_counter++;
            IterationStatementHandler((ASTIterationStatement) statement);
            iteration_counter--;
        }
        else if (statement instanceof ASTBreakStatement)
        {
            if (iteration_counter == 0)
            {
                SemanticErrorHandler.ES03();
            }
            else
            {
                BreakStatementHandler((ASTBreakStatement) statement);
            }
        }
        else if (statement instanceof ASTContinueStatement)
        {
            if (iteration_counter == 0)
            {
                //continue错误
            }
            else
            {
                ContinueStatementHandler((ASTContinueStatement) statement);
            }
        }
        else if (statement instanceof ASTLabeledStatement)
        {
            LabelStatementHandler((ASTLabeledStatement) statement);
        }
        else if (statement instanceof ASTGotoStatement)
        {
            GotoStatementHandler((ASTGotoStatement) statement);
        }
    }

    //这个很重要
    FunctionContent FunctionHandler(ASTFunctionDefine functionDefine)
    {
        //进行局部环境的初始化
        SymbolTable.EnterNewFunction();
        InsBuffer = new LinkedList<>();

        this.RegDataBase = new HashMap<>();

        String func_out_header = "define ";
        now_function_type_C = TypeSpecifierListHandler(functionDefine.specifiers);

        func_out_header += ConvertCType2LLVMIR(now_function_type_C);

        String func_name = "";
        ASTFunctionDeclarator ast_func_declarator = (ASTFunctionDeclarator) functionDefine.declarator;

        if (ast_func_declarator.declarator instanceof ASTVariableDeclarator)
        {
            func_name += ((ASTVariableDeclarator) ast_func_declarator.declarator).identifier.value.toString();
        }

        func_out_header += " @" + func_name + "(";

        StringBuilder para_string = new StringBuilder();
        String[] para_types = new String[((ASTFunctionDeclarator) functionDefine.declarator).params.size()];

        int count = 0;

        LinkedList<String> params_for_FunctionContent = new LinkedList<>();
        // 1.检查参数，添加参数的符号表
        for (ASTParamsDeclarator para :
                ((ASTFunctionDeclarator) functionDefine.declarator).params)
        {
            String para_type = TypeSpecifierListHandler(para.specfiers);
            if (para.declarator instanceof ASTVariableDeclarator)
            {
                params_for_FunctionContent.add(GetReg(ConvertCType2LLVMIR(para_type)));
                if (!para_string.toString().equals(""))
                {
                    para_string.append(", ");
                }
                para_string.append(ConvertCType2LLVMIR(para_type)).append(" ").append("%").append(register_counter - 1);
            }
        }
        FunctionContent rt_value = new FunctionContent(func_name, InsBuffer, params_for_FunctionContent);

        GetRegCount(); //函数基本块起点

        // 2.进行参数的load
        for (ASTParamsDeclarator para :
                ((ASTFunctionDeclarator) functionDefine.declarator).params)
        {
            String para_type = TypeSpecifierListHandler(para.specfiers);
            if (para.declarator instanceof ASTVariableDeclarator)
            {
                VariableDeclaratorHandler(((ASTVariableDeclarator) para.declarator), para_type);//为参数申请空间

                Sy_AtomVar thisVar = SymbolTable.GetAtomTypeIDInfo((((ASTVariableDeclarator) para.declarator).identifier.value.toString()));
                para_types[count] = thisVar.GetLType();//增加类型
                //得到参数对应的寄存器
                InsBuffer.add(new IR_store(thisVar.GetLType(), "%" + count, thisVar.reg_addr));
                count++;
            }
        }
        func_out_header += para_string;
        func_out_header += ") #0 {\n";

        rt_value.head_str = func_out_header;
//        IR_code += func_out_header;
        //注册当前函数
        SymbolTable.PutFunctionDec(new Sy_Func(func_name, ConvertCType2LLVMIR(now_function_type_C), para_types));

        //真正执行CompoundStatement中指令收集
        CompoundStatementHandler(functionDefine.body);

        //函数不含return
        if (!now_function_return_exist)
        {
            SemanticErrorHandler.ES08(func_name);
            if (now_function_type_C.equals("void"))
            {
                InsBuffer.add(new IR_ret());

            }
            else
            {
                InsBuffer.add(new IR_ret(ConvertCType2LLVMIR(now_function_type_C), "0"));
            }
        }

        // 找不存在的label
        for (IR_instruction instruction :
                InsBuffer)
        {
//            IR_code += "  " + instruction.toString() + "\n";
            if (instruction instanceof IR_branch) //未填goto
            {
                IR_branch branch = (IR_branch) instruction;
                if (!branch.is_conditional && branch.dest == null)
                {
                    String label_name = null;
                    //找对应标号是指向这个语句的
                    label_name = SymbolTable.GetUnexistLabelName(branch);
                    SemanticErrorHandler.ES07(label_name);
                }
            }
        }

        now_function_type_C = null;
        now_function_return_exist = false;
        this.register_counter = 0;

        return rt_value;
    }

    void CompoundStatementHandler(ASTCompoundStatement compoundStatement)
    {
        for (ASTNode blockItem :
                compoundStatement.blockItems)
        {
            //在这里进行判断操作
            if (blockItem instanceof ASTDeclaration)
            {
                DeclarationHandler((ASTDeclaration) blockItem);
            }
            else if (blockItem instanceof ASTStatement)
            {
                StatementHandler((ASTStatement) blockItem);
            }
        }
    }

    void ReturnStatementHandler(ASTReturnStatement returnStatement)
    {
        now_function_return_exist = true;
        if (returnStatement.expr == null || returnStatement.expr.size() == 0)
        {
            InsBuffer.add(new IR_ret());
        }
        else
        {
            String val = ExpressionHandler(returnStatement.expr.get(0));
            String type = ConvertCType2LLVMIR(now_function_type_C);
            if (val == null)
            {
                if (returnStatement.expr.get(0) instanceof ASTIntegerConstant)
                {
                    val = ((ASTIntegerConstant) returnStatement.expr.get(0)).value.toString();
                }
            }
            InsBuffer.add(new IR_ret(type, val));
        }
    }

    void SelectionStatementHandler(ASTSelectionStatement selectionStatement)
    {
        is_condition_expression = true;
        String ans_reg = ExpressionHandler(selectionStatement.cond.get(0));
        int True_label = GetRegCount();
        IR_branch br1 = new IR_branch(ans_reg, "%" + True_label, null);
        InsertBranch(br1);
        InsertTag(True_label + "");

        StatementHandler(selectionStatement.then);

        IR_branch br2 = new IR_branch(null);
        InsertBranch(br2);

        int False_label = GetRegCount();

        br1.false_dest = "%" + False_label;
        InsertTag("" + False_label);

        if (selectionStatement.otherwise != null)
        {
            StatementHandler(selectionStatement.otherwise);
            int Out_label = GetRegCount();
            br2.dest = "%" + Out_label;
            IR_instruction br3 = new IR_branch("%" + Out_label);
            InsertBranch(br3);
            InsertTag(Out_label + "");
        }
        else
        {
            br2.dest = "%" + False_label;
        }

    }

    void DcIterationStatementHandler(ASTIterationDeclaredStatement itDeclaredStatement)
    {
        if (itDeclaredStatement.init != null)
        {
            DeclarationHandler(itDeclaredStatement.init);
        }
        int Start_label = GetRegCount();
        now_continue_position = Start_label;//todo: continue日后也需要队列支持
        InsertBranch("%" + Start_label);
        InsertTag(Start_label + "");

        IR_branch condition = null;

        String True_label = "";
        String False_label = "";

        //cmp
        if (itDeclaredStatement.cond != null && itDeclaredStatement.cond.size() > 0)
        {
            is_condition_expression = true;
            String ans_reg = ExpressionHandler(itDeclaredStatement.cond.getLast());
            True_label += GetRegCount();
            condition = new IR_branch(ans_reg, "%" + True_label, null);
            InsertBranch(condition);
            InsertTag(True_label);
            is_condition_expression = false;
        }

        StatementHandler(itDeclaredStatement.stat);

        if (itDeclaredStatement.step != null && itDeclaredStatement.step.size() > 0)
        {
            int new_label = GetRegCount();
            InsertBranch("%" + new_label);
            InsertTag(new_label + "");
            ExpressionHandler(itDeclaredStatement.step.getLast());
        }

        False_label = GetRegCount() + "";
        InsertBranch("%" + Start_label);
        InsertTag(False_label);
        if (condition != null)
        {
            condition.false_dest = "%" + False_label;
        }

        for (int i = 0; i < break_statements_buffer.size(); i++)
        {
            break_statements_buffer.pop().dest = "%" + False_label;
        }

    }

    void IterationStatementHandler(ASTIterationStatement iterationStatement)
    {
        if (iterationStatement.init != null && iterationStatement.init.size() > 0)
        {
            ExpressionHandler(iterationStatement.init.getLast());
        }
        int Start_label = GetRegCount();
        now_continue_position = Start_label;//todo: continue日后也需要队列支持
        InsertBranch("%" + Start_label);
        InsertTag(Start_label + "");

        IR_branch condition = null;

        String True_label = "";
        String False_label = "";

        //cmp
        if (iterationStatement.cond != null && iterationStatement.cond.size() > 0)
        {
            is_condition_expression = true;
            String ans_reg = ExpressionHandler(iterationStatement.cond.getLast());
            is_condition_expression = false;
            True_label += GetRegCount();
            condition = new IR_branch(ans_reg, "%" + True_label, null);
            InsertBranch(condition);
            InsertTag(True_label);
        }

        StatementHandler(iterationStatement.stat);

        if (iterationStatement.step != null && iterationStatement.step.size() > 0)
        {
            int new_label = GetRegCount();
            InsertBranch("%" + new_label);
            InsertTag(new_label + "");
            ExpressionHandler(iterationStatement.step.getLast());
        }

        False_label = GetRegCount() + "";
        InsertBranch("%" + Start_label);
        InsertTag(False_label + "");
        if (condition != null)
        {
            condition.false_dest = "%" + False_label;
        }

        for (int i = 0; i < break_statements_buffer.size(); i++)
        {
            break_statements_buffer.pop().dest = "%" + False_label;
        }
    }

    void BreakStatementHandler(ASTBreakStatement breakStatement)
    {
        IR_branch break_statement = InsertBranch((String) null);
        InsertTag("" + GetRegCount());

        break_statements_buffer.add(break_statement);
    }

    void ContinueStatementHandler(ASTContinueStatement continueStatement)
    {
        InsertBranch("%" + now_continue_position);
        InsertTag("" + GetRegCount());
    }

    //注意一下基本块，这里可能需要添加一个标号
    void GotoStatementHandler(ASTGotoStatement gotoStatement)
    {
        String label_name = gotoStatement.label.value.toString();
        Sy_Label goto_info = SymbolTable.GetLabel(label_name);

        IR_branch goto_ins = new IR_branch(null);
        if (goto_info == null)
        {
            goto_info = new Sy_Label(label_name, null);
            SymbolTable.PutJMPLabel(goto_info);
            goto_info.GotoPointer = goto_ins;
        }
        else
        {
            if (goto_info.dest_label_reg == null)
            {
                ((IR_branch) goto_info.GotoPointer).ins_pointer = goto_ins;
            }
            else
            {
                goto_ins.dest = goto_info.dest_label_reg;//这个
            }
        }
        InsertBranch(goto_ins);
        InsertTag("" + GetRegCount());
    }

    void LabelStatementHandler(ASTLabeledStatement labeledStatement)
    {
        String label_name = labeledStatement.label.value.toString();
        Sy_Label label_info = SymbolTable.GetLabel(label_name);
        if (label_info == null)
        {
            SymbolTable.PutJMPLabel(new Sy_Label(label_name, "%" + GetRegCount()));
            InsertTag("" + (register_counter - 1));
        }
        else
        {
            if (label_info.dest_label_reg == null)
            {
                InsertTag("" + GetRegCount());
                LLFT((IR_branch) label_info.GotoPointer, "%" + (register_counter - 1)); //将label转为标号进行填充，因为没有号码的数字，所以要向前填branch
                label_info.dest_label_reg = "%" + (register_counter - 1);
            }
            else
            {
                SemanticErrorHandler.ES07(label_name);
            }
        }
        if (labeledStatement.stat != null)
        {
            StatementHandler(labeledStatement.stat);
        }
    }

    //查上一条指令是不是br，如果是的话，则需要新建一个标号
    IR_branch InsertBranch(String target_label)
    {
        //有些无效操作可能导致action为空
        if (InsBuffer.size() > 0 && InsBuffer.getLast() instanceof IR_branch)
        {
            InsertTag("" + GetRegCount());
        }
        IR_branch instruction = new IR_branch(target_label);
        InsBuffer.add(instruction);
        return instruction;
    }

    IR_instruction InsertBranch(String compare_reg, String true_label, String false_label)
    {
        if (InsBuffer.size() > 0 && InsBuffer.getLast() instanceof IR_branch)
        {
            InsertTag("" + GetRegCount());
        }
        IR_instruction instruction = new IR_branch(compare_reg, true_label, false_label);

        InsBuffer.add(instruction);
        return instruction;
    }

    void InsertBranch(IR_instruction instruction)
    {
        if (InsBuffer.size() > 0 && InsBuffer.getLast() instanceof IR_branch) //上一条指令也是br
        {
            InsertTag("" + GetRegCount());
        }
        InsBuffer.add(instruction);
    }

    //查上一条指令是不是tag，如果是的话，需要加入一条无意义的branch
    void InsertTag(String label_no_prefix)
    {
        if (InsBuffer.size() > 0 && InsBuffer.getLast() instanceof IR_tag)//上一条指令也是label
        {
            InsertBranch("%" + label_no_prefix);
        }
        InsBuffer.add(new IR_tag(label_no_prefix));
    }

    //拉链反填
    void LLFT(IR_branch instruction, String branch_tag_with_prefix)
    {
        instruction.dest = branch_tag_with_prefix;
        if (instruction.ins_pointer != null)
        {
            LLFT((IR_branch) instruction.ins_pointer, branch_tag_with_prefix);
        }
    }

    //注册,返回寄存器
    void VariableDeclaratorHandler(ASTVariableDeclarator variableDeclarator, String C_type)
    {
        String now_reg = GetReg(ConvertCType2LLVMIR(C_type));
        String var_name = variableDeclarator.identifier.value.toString();
        //Scope,只看当前层是否重复定义
        if (!SymbolTable.isReDefine(var_name))
        {
            SymbolTable.PutVar(new Sy_AtomVar(var_name, ConvertCType2LLVMIR(C_type), now_reg));
        }
        //重复定义
        else
        {
            SemanticErrorHandler.ES02(true, var_name);
        }
        //打印
        InsBuffer.add(new IR_alloca(now_reg, ConvertCType2LLVMIR(C_type)));
    }

    void DeclarationHandler(ASTDeclaration declaration)
    {
        String C_type = TypeSpecifierListHandler(declaration.specifiers);
        for (ASTInitList il : declaration.initLists)
        {
            if (il.declarator instanceof ASTVariableDeclarator)
            {
                ASTVariableDeclarator variableDeclarator = (ASTVariableDeclarator) il.declarator;
                VariableDeclaratorHandler(variableDeclarator, C_type);
                //从expression中加载值
                if (il.exprs.size() > 0)
                {
                    String store_val = "";

                    store_val = ExpressionHandler(il.exprs.get(0));

                    if (store_val == null)
                    {
                        store_val = ConstantHandler(il.exprs.get(0));
                    }
                    String var = ((ASTVariableDeclarator) il.declarator).identifier.value.toString();
                    var = SymbolTable.GetAtomTypeIDInfo(var).reg_addr;
                    InsBuffer.add(new IR_store(ConvertCType2LLVMIR(C_type), store_val, var));
                }
            }
            if (il.declarator instanceof ASTArrayDeclarator)
            {
                Stack<Integer> array_dimension = new Stack<>();
                String array_name = "";
                ASTArrayDeclarator now_declarator = (ASTArrayDeclarator) il.declarator;
                while (true)
                {
                    array_dimension.push((Integer) ((ASTIntegerConstant) ((ASTArrayDeclarator) now_declarator).expr).value);
                    if ((now_declarator).declarator instanceof ASTArrayDeclarator)
                    {
                        now_declarator = (ASTArrayDeclarator) now_declarator.declarator;
                    }
                    else
                    {
                        if (now_declarator.declarator instanceof ASTVariableDeclarator)
                        {
                            array_name = ((((ASTVariableDeclarator) now_declarator.declarator).identifier).value);
                        }
                        break;
                    }
                }
                Sy_PolyVar now_poly = new Sy_PolyVar(null, null, new Sy_AtomVar(null, ConvertCType2LLVMIR(C_type), null), array_dimension.pop());
                while (!array_dimension.empty())
                {
                    now_poly = new Sy_PolyVar(null, null, now_poly, array_dimension.pop());
                }
                now_poly.name = array_name;
                SymbolTable.PutSymbol(now_poly);
                now_poly.reg_addr = "%" + register_counter;
                InsBuffer.add(new IR_alloca(GetReg(now_poly.GetLType()), now_poly.GetLType()));
            }
        }
    }

    String ArrayAccessHandler(ASTArrayAccess arrayAccess)
    {
        //如果expression是变量，需要分多次访问
        ASTArrayAccess now_array = arrayAccess;
        LinkedList<ASTExpression> access_info = new LinkedList<>(); //访存得改成expression
        String array_name = "";
        while (true)
        {
            if (now_array.elements != null && now_array.elements.get(0) != null)
            {
                access_info.push(now_array.elements.get(0));
            }
            if (now_array.arrayName instanceof ASTArrayAccess)
            {
                now_array = (ASTArrayAccess) now_array.arrayName;
            }
            else
            {
                if (now_array.arrayName instanceof ASTIdentifier)
                {
                    array_name = ((ASTIdentifier) now_array.arrayName).value.toString();
                }
                break;
            }
        }
        Sy_PolyVar poly = (Sy_PolyVar) SymbolTable.GetSymbolInfo(array_name);
        String offset = "";
        String now_base = poly.reg_addr;

        String reg_addr = null;
        for (int i = 0; i < access_info.size(); i++)
        {

            offset = ExpressionHandler(access_info.get(i));
            if (offset == null)
            {
                offset = ConstantHandler(access_info.get(i));//可以在这里查它是不是不是整形

            }
            reg_addr = GetReg(poly.GetInsideItem().GetLType());
            InsBuffer.add(new IR_getelementptr(reg_addr, now_base, offset, poly));
            if (poly.GetInsideItem() instanceof Sy_PolyVar) //给下一个复合变量做准备
            {
                poly = (Sy_PolyVar) poly.GetInsideItem();
                now_base = "%" + (register_counter - 1);
            }
        }
        return reg_addr;
    }

    //返回一个常量，或者和这个常量有关的寄存器
    /*
       integer/char/float: 返回一个数
       string: 构造一个无名字符串，并且对其进行加载。总之，返回一个寄存器
     */
    String ConstantHandler(ASTExpression constant)
    {
        if (constant instanceof ASTIntegerConstant)
        {
            return ((ASTIntegerConstant) constant).value.toString();
        }
        else if (constant instanceof ASTStringConstant)
        {
            ASTStringConstant stringConstant = (ASTStringConstant) constant;
            Sy_Str str = SymbolTable.GetStr(stringConstant.value.toString());
            if (str == null)
            {
                str = new Sy_Str(nameless_str_counter, stringConstant.value.toString());
                Global_declar.add(new IR_global_strdec(str));
                SymbolTable.PutStr(stringConstant.value.toString(), str);
                nameless_str_counter++;
            }
            String rt_reg = GetReg("i8*");
            InsBuffer.add(new IR_getelementptr(rt_reg, str.GetName(), "0", str));
            //无名字符串: 首先查找，如果没找到，则增加新的。 无名字符串的键：其实是字符串值本身
            return rt_reg;
        }
        else if (constant instanceof ASTCharConstant)
        {
            return ((ASTCharConstant) constant).value.toString();
        }
        else if (constant instanceof ASTFloatConstant)
        {
            return ((ASTFloatConstant) constant).value.toString();
        }
        return "unknownConstant";
    }

    //返回这个常量的类型
    /*
     * integer: i32
     * char: i8
     * float: double
     * string: i8*
     * */
    String ConstantTypeHandler(ASTExpression constant)
    {
        if (constant instanceof ASTIntegerConstant)
        {
            return "i32";
        }
        else if (constant instanceof ASTStringConstant)
        {
            return "i8*";
        }
        else if (constant instanceof ASTCharConstant)
        {
            return "i8";
        }
        else if (constant instanceof ASTFloatConstant)
        {
            return "double";
        }
        return "unknownConstantType";
    }

    //返回结果存的寄存器
    public String ExpressionHandler(ASTExpression expression) //递归调用
    {
        //叶节点1: 整形
        if (expression instanceof ASTIntegerConstant || expression instanceof ASTStringConstant || expression instanceof ASTCharConstant || expression instanceof ASTFloatConstant)
        {
            // char\Integer\
            return null;
        }
        else if (expression instanceof ASTArrayAccess)
        {
            return ArrayAccessHandler((ASTArrayAccess) expression);
        }
        else if (expression instanceof ASTFunctionCall)
        {
            ASTFunctionCall functionCall = ((ASTFunctionCall) expression);
            String func_name = ((ASTIdentifier) functionCall.funcname).value.toString();
            List<ASTExpression> para_list = functionCall.argList;
            String[] params = new String[para_list.size()];
            String[] params_type = new String[para_list.size()];

            int count = 0;
            for (ASTExpression para_expression :
                    functionCall.argList)
            {
                String reg = ExpressionHandler(para_expression);
                if (reg == null)//constant
                {
                    reg = ConstantHandler(para_expression);
                    params_type[count] = ConstantTypeHandler(para_expression);
                }
                else
                {
                    params_type[count] = RegDataBase.get(reg);
                }
                params[count] = reg;
                count++;
            }
            Sy_Func func_detail = SymbolTable.GetFunction(func_name);

            if (func_detail == null)
            {
                SemanticErrorHandler.ES01(false, func_name);
                return null;
            }

            if (func_detail.GetLType().equals("void"))
            {
                InsBuffer.add(new IR_call(null, func_detail, params, params_type));
                return null;
            }
            else
            {
                String rt_reg = GetReg(func_detail.GetLType());
                InsBuffer.add(new IR_call(rt_reg, func_detail, params, params_type));
                return rt_reg;
            }

        }
        //后缀表达式或一元表达式
        else if (expression instanceof ASTUnaryExpression || expression instanceof ASTPostfixExpression)
        {
            String op = "";
            String src = "";
            String name = null;
            ASTExpression tmp;
            if (expression instanceof ASTUnaryExpression)
            {
                src = ExpressionHandler(((ASTUnaryExpression) expression).expr);
                tmp = ((ASTUnaryExpression) expression).expr;
                op = ((ASTUnaryExpression) expression).op.value.toString();
            }
            else
            {
                src = ExpressionHandler(((ASTPostfixExpression) expression).expr);
                tmp = ((ASTPostfixExpression) expression).expr;
                op = ((ASTPostfixExpression) expression).op.value.toString();
            }
            if (tmp instanceof ASTIdentifier)
            {
                name = ((ASTIdentifier) tmp).value.toString(); //得到名字
            }
            String op_type = RegDataBase.get(src);

            String rt_reg = "";
            switch (op)
            {
                case "!":
                    InsBuffer.add(new IR_compare(GetReg(op_type), "ne", op_type, src, "0"));
                    rt_reg = "%" + (register_counter - 1);
                    if (!is_condition_expression) //非表达式情况，需要进行位扩展
                    {
                        InsBuffer.add(new IR_op(GetReg("i1"), "xor", "i1", "%" + (register_counter - 2), "true"));
                        rt_reg = GetReg(op_type);
                        InsBuffer.add(new IR_exten(rt_reg, "zext", "i1", "%" + (register_counter - 2), op_type));
                    }
                    break;
                case "~":
                    rt_reg = GetReg(op_type);
                    InsBuffer.add(new IR_op(rt_reg, "xor", op_type, src, "-1"));
                    break;
                case "++":
                    rt_reg = GetReg(op_type);
                    InsBuffer.add(new IR_op(rt_reg, "add", op_type, src, "1"));
                    InsBuffer.add(new IR_store(op_type, rt_reg, SymbolTable.GetAtomTypeIDInfo(name).reg_addr));
                    break;
            }

            return rt_reg;
        }
        else if (expression instanceof ASTBinaryExpression)
        {
            ASTBinaryExpression thisNode = (ASTBinaryExpression) expression;
            String op = thisNode.op.value.toString();
            String op_type = "";
            if (op.equals("=") || op.equals("+=") || op.equals("-="))
            {
                boolean is_reg = false;
                String src1 = "";
                if (thisNode.expr1 instanceof ASTIdentifier)
                {
                    src1 = ((ASTIdentifier) thisNode.expr1).value.toString();
                }
                else
                {
                    src1 = ExpressionHandler(thisNode.expr1);
                    is_reg = true;
                }
                String src2 = ExpressionHandler(thisNode.expr2);
                if (src2 == null) //constant
                {
                    src2 = ConstantHandler((ASTIntegerConstant) thisNode.expr2);
                    op_type = ConstantTypeHandler((ASTIntegerConstant) thisNode.expr2);
                }
                else
                {
                    op_type = RegDataBase.get(src2);
                }
                if (op.equals("+="))
                {
                    String val_reg = ExpressionHandler(thisNode.expr1);
                    InsBuffer.add(new IR_op("%" + GetRegCount(), "add", op_type, val_reg, src2));
                    src2 = "%" + (register_counter - 1);
                }
                else if (op.equals("-=")) //
                {
                    String val_reg = ExpressionHandler(thisNode.expr1);
                    InsBuffer.add(new IR_op("%" + GetRegCount(), "sub", op_type, val_reg, src2));
                    src2 = "%" + (register_counter - 1);
                }
                if (is_reg)
                {
                    InsBuffer.add(new IR_store(op_type, src2, src1));
                }
                else
                {
                    InsBuffer.add(new IR_store(op_type, src2, SymbolTable.GetAtomTypeIDInfo(src1).reg_addr));
                }
                return "Assignment";
            }
            else if (op.equals("&&"))//短路
            {
                String src1 = ExpressionHandler(thisNode.expr1);
                String rt_reg = "%" + GetRegCount();
                InsBuffer.add(new IR_compare(rt_reg, "ne", RegDataBase.get(src1), src1, "0"));
                return rt_reg;
            }
            else
            {
                String src1 = ExpressionHandler(thisNode.expr1);
                if (src1 == null)
                {
                    if (thisNode.expr1 instanceof ASTIntegerConstant)
                    {
                        src1 = ((ASTIntegerConstant) thisNode.expr1).value.toString();
                        op_type = "i32";
                    }
                }
                else
                {
                    op_type = RegDataBase.get(src1);
                }
                String op_type2 = "";
                String src2 = ExpressionHandler(thisNode.expr2);
                if (src2 == null) //constant
                {
                    src2 = ConstantHandler(thisNode.expr2);
                    op_type2 = ConstantTypeHandler(thisNode.expr2);
                }
                else
                {
                    op_type2 = RegDataBase.get(src2);
                }
                String rt_reg = GetReg(op_type2);
                //操作符判断
                String cmp_type = null;
                switch (op)
                {
                    case ">":
                        cmp_type = "sgt";
                        break;
                    case "<":
                        cmp_type = "slt";
                        break;
                    case ">=":
                        cmp_type = "sge";
                        break;
                    case "<=":
                        cmp_type = "sle";
                        break;
                    case "==":
                        cmp_type = "eq";
                        break;
                    case "!=":
                        cmp_type = "ne";
                        break;
                }
                if (cmp_type == null) //todo 寄存器类型系统需要重做
                {
                    op = OperatorMap.get(op);
                    InsBuffer.add(new IR_op(rt_reg, op, op_type, src1, src2));
                }
                else
                {
                    InsBuffer.add(new IR_compare(rt_reg, cmp_type, op_type, src1, src2));
                }
                return rt_reg;
            }
        }
        //叶节点2: 变量
        else if (expression instanceof ASTIdentifier)
        {
            ASTIdentifier thisNode = (ASTIdentifier) expression;
            //未声明使用报错
            Sy_Item detail = SymbolTable.GetSymbolInfo(thisNode.value.toString());
            if (detail instanceof Sy_PolyVar)
            {

            }
            else
            {
                Sy_AtomVar atom_detail = (Sy_AtomVar) detail;
                String src = "";
                if (detail == null) //未出现，进行报错
                {
                    SemanticErrorHandler.ES01(true, thisNode.value.toString());
                    String new_reg = GetReg("i32");
                    InsBuffer.add(new IR_op(new_reg, "add", "i32", "0", "0"));
                    return new_reg;
                }
                else
                {
                    src = atom_detail.reg_addr;
                    String new_reg = GetReg(atom_detail.GetLType());
                    InsBuffer.add(new IR_load(new_reg, atom_detail.GetLType(), src));
                    return new_reg;
                }
            }

        }
        return "none";
    }

    String TypeSpecifierListHandler(List<ASTToken> specifiers)
    {
        String type = specifiers.get(0).value.toString();
        for (int i = 1; i < specifiers.size(); i++)
        {
            type += specifiers.get(1).value.toString() + " ";
        }
        return type;
    }

    String ConvertCType2LLVMIR(String type)
    {
        if (type.contains("long long"))
        {
            return "i64";
        }
        else if (type.contains("char"))
        {
            return "i8";
        }
        else if (type.contains("void"))
        {
            return "void";
        }
        else if (type.contains("bit"))
        {
            return "i1";
        }
        else if (type.contains("int"))
        {
            return "i32";
        }
        else if (type.equals("double"))
        {
            return "double";
        }
        else if (type.equals("float"))
        {
            return "float";
        }
        return "unknownType";
    }

    int GetRegCount()
    {
        int t = this.register_counter;
        register_counter++;
        return t;
    }

    String GetReg(String reg_type)
    {
        int t = GetRegCount();
        RegDataBase.put("%" + t, reg_type);
        return "%" + t;
    }

    public WzcLLVM(ASTCompilationUnit ASTNode)
    {
        this.ASTRoot = ASTNode;
        this.SymbolTable = new Sy_Table();
        this.break_statements_buffer = new LinkedList<>();
        functions = new LinkedList<>();
        // global
        this.InsBuffer = new LinkedList<>();

        this.Global_declar = new LinkedList<>();
        OperatorMap = new HashMap<>();
        //构造运算符的映射
        OperatorMap.put("+", "add");
        OperatorMap.put("-", "sub");
        OperatorMap.put("*", "mul");
        OperatorMap.put("/", "sdiv");
        OperatorMap.put("<<", "shl");
        OperatorMap.put("%", "srem");
    }
}
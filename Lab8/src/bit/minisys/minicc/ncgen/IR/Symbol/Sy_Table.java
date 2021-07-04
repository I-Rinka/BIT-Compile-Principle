package bit.minisys.minicc.ncgen.IR.Symbol;

import bit.minisys.minicc.ncgen.IR.IRInstruction.IR_branch;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Sy_Table
{
    private final Stack<HashMap<String, Sy_Item>> SymbolTableStack;
    private HashMap<String, Sy_Item> Global_SyT = null;
    private HashMap<String, Sy_Item> Local_SyT = null;
    private HashMap<String, Sy_Item> Now_Scope_SyT = null;

    public Sy_Table()
    {
        this.SymbolTableStack = new Stack<>();
        this.SymbolTableStack.push(new HashMap<>());
        Global_SyT = SymbolTableStack.peek();
    }

    public void EnterNewFunction()
    {
        while (SymbolTableStack.size() > 1)
        {
            SymbolTableStack.pop();
        }
        SymbolTableStack.push(new HashMap<>());
        Local_SyT = SymbolTableStack.peek();
        Now_Scope_SyT = SymbolTableStack.peek();
    }

    public void EnterNewScope()
    {
        SymbolTableStack.push(new HashMap<>());
        Now_Scope_SyT = SymbolTableStack.peek();
    }

    public void ExitScope()
    {
        SymbolTableStack.push(new HashMap<>());
        Now_Scope_SyT = SymbolTableStack.peek();
    }

    public void PutFunctionDec(Sy_Func function)
    {
        Global_SyT.put(function.GetName(), function);
    }

    public void PutJMPLabel(Sy_Label label)
    {
        Local_SyT.put(label.GetName(), label);
    }

    public void PutStr(String str_origin, Sy_Str str)
    {
        Global_SyT.put(str_origin, str);
    }

    public void PutSymbol(Sy_Item symbol)
    {
        Local_SyT.put(symbol.GetName(), symbol);
    }

    public Sy_Str GetStr(String str_origin)
    {
        Sy_Item str = Global_SyT.get(str_origin);
        if (str instanceof Sy_Str)
        {
            return (Sy_Str) str;
        }
        return null;
    }

    public void PutVar(Sy_AtomVar var)
    {
        Now_Scope_SyT.put(var.GetName(), var);
    }

    public Sy_Item GetSymbolInfo(String SymbolName)
    {
        for (int j = SymbolTableStack.size() - 1; j >= 0; j--)
        {
            //最好把这个东西的使用禁止掉
            HashMap<String, Sy_Item> syTable = SymbolTableStack.get(j);
            if (syTable.containsKey(SymbolName))
            {
                return syTable.get(SymbolName);
            }
        }
        return null;//没有找到符号
    }

    public Sy_AtomVar GetAtomTypeIDInfo(String SymbolName)
    {
        Sy_Item val = GetSymbolInfo(SymbolName);
        if (val instanceof Sy_AtomVar)
        {
            return (Sy_AtomVar) val;
        }
        return null;
    }

    public Sy_Label GetLabel(String LabelName)
    {
        Sy_Item val = GetSymbolInfo(LabelName);
        if (val instanceof Sy_Label)
        {
            return (Sy_Label) val;
        }
        return null;
    }

    public Sy_Func GetFunction(String func_name)
    {
        Sy_Item func = Global_SyT.get(func_name);
        if (func instanceof Sy_Func)
        {
            return (Sy_Func) func;
        }
        return null;
    }

    public String GetUnexistLabelName(IR_branch jmp)
    {
        for (Map.Entry<String, Sy_Item> record :
                Local_SyT.entrySet())
        {
            if (record.getValue() instanceof Sy_Label)
            {
                if (((Sy_Label) record.getValue()).GotoPointer == jmp)
                {
                    return record.getValue().GetName();
                }
            }

        }
        return null;
    }

    public boolean isReDefine(String name)
    {
        return SymbolTableStack.peek().containsKey(name);
    }
}

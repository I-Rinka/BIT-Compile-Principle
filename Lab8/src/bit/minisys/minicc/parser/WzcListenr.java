package bit.minisys.minicc.parser;

import java.util.LinkedList;
import java.util.Stack;

import org.antlr.v4.runtime.tree.TerminalNode;

import bit.minisys.minicc.parser.CParser.*;
import bit.minisys.minicc.parser.ast.*;

public class WzcListenr extends CBaseListener
{
    // 每次进入函数的时候把自己的节点放进去
    // 每次出来的时候获取父节点（不弹出父节点），然后将自己放进去

    protected Stack<ASTNode> nodeStack;
    private ASTNode thisNode;
    private ASTNode parentNode;
    public ASTNode returNode;

    @Override
    public void visitTerminal(TerminalNode node)
    {
        parentNode = nodeStack.peek();
        switch (node.getSymbol().getType())
        {
            case CLexer.Int:
            case CLexer.Double:
            case CLexer.Void:
            case CLexer.Float:
                if (parentNode.getClass() == ASTFunctionDefine.class)
                {
                    ((ASTFunctionDefine) parentNode).specifiers
                            .add(new ASTToken(node.getSymbol().getText(), node.getSymbol().getTokenIndex()));
                }
                else if (parentNode.getClass() == ASTDeclaration.class)
                {
                    ASTDeclaration astDeclaration = (ASTDeclaration) parentNode;
                    if (astDeclaration.specifiers == null)
                    {
                        astDeclaration.specifiers = new LinkedList<ASTToken>();
                    }
                    astDeclaration.specifiers
                            .add(new ASTToken(node.getSymbol().getText(), node.getSymbol().getTokenIndex()));
                }
                else if (parentNode.getClass() == ASTParamsDeclarator.class)
                {
                    ((ASTParamsDeclarator) parentNode).specfiers
                            .add(new ASTToken(node.getSymbol().getText(), node.getSymbol().getTokenIndex()));
                }
                break;
            case CLexer.Identifier:
                if (parentNode.getClass() == ASTVariableDeclarator.class)
                {
                    ((ASTVariableDeclarator) parentNode).identifier = new ASTIdentifier(
                            node.getSymbol().getText().toString(), node.getSymbol().getTokenIndex());
                }
                else if (parentNode.getClass() == ASTInitList.class)
                {

                    ASTInitList astInitList = ((ASTInitList) parentNode);

                    astInitList.exprs
                            .add(new ASTIdentifier(node.getSymbol().getText(), node.getSymbol().getTokenIndex()));

                }
                else if (parentNode.getClass() == ASTReturnStatement.class)
                {

                    ASTReturnStatement astReturn = ((ASTReturnStatement) parentNode);
                    if (astReturn.expr == null)
                    {
                        astReturn.expr = new LinkedList<ASTExpression>();
                    }
                    astReturn.expr.add(new ASTIdentifier(node.getSymbol().getText(), node.getSymbol().getTokenIndex()));

                }
                else if (parentNode instanceof ASTExpression)
                {
                    findExpressionToMount((ASTExpression) new ASTIdentifier(node.getSymbol().getText(),
                            node.getSymbol().getTokenIndex()), (ASTExpression) parentNode);
                }
                else if (parentNode instanceof ASTLabeledStatement)
                {
                    ((ASTLabeledStatement) parentNode).label = new ASTIdentifier(node.getSymbol().getText(),
                            node.getSymbol().getTokenIndex());
                }
                else if (parentNode instanceof ASTGotoStatement)
                {
                    ((ASTGotoStatement) parentNode).label = new ASTIdentifier(node.getSymbol().getText(),
                            node.getSymbol().getTokenIndex());
                }
                break;
            case CLexer.Constant:
            case CLexer.StringLiteral:
                ASTExpression thisConstant;
                if (node.getText().charAt(0) == '\'')
                {
                    thisConstant = new ASTCharConstant(node.getSymbol().getText(), node.getSymbol().getTokenIndex());
                }
                else if (node.getText().contains("."))
                {
                    thisConstant = new ASTFloatConstant(Double.valueOf(node.getSymbol().getText()),
                            node.getSymbol().getTokenIndex());
                }
                else if (node.getText().charAt(0) == '\"')
                {
                    thisConstant = new ASTStringConstant(node.getSymbol().getText(), node.getSymbol().getTokenIndex());
                }
                else
                {
                    thisConstant = new ASTIntegerConstant(Integer.valueOf(node.getSymbol().getText()),
                            node.getSymbol().getTokenIndex());
                }
                if (parentNode.getClass() == ASTInitList.class)
                {

                    ASTInitList astInitList = ((ASTInitList) parentNode);
                    astInitList.exprs.add(thisConstant);

                }
                else if (parentNode.getClass() == ASTArrayDeclarator.class)
                {
                    ((ASTArrayDeclarator) parentNode).expr = thisConstant;

                }
                else if (parentNode.getClass() == ASTReturnStatement.class)
                {

                    ASTReturnStatement astReturn = ((ASTReturnStatement) parentNode);
                    if (astReturn.expr == null)
                    {
                        astReturn.expr = new LinkedList<ASTExpression>();
                    }
                    astReturn.expr.add(thisConstant);
                }
                else if (parentNode instanceof ASTExpression)
                {
                    findExpressionToMount(thisConstant, (ASTExpression) parentNode);
                }
                break;
            case CLexer.Assign:
            case CLexer.Plus:
            case CLexer.Minus:
            case CLexer.Div:
            case CLexer.Star:
            case CLexer.Equal:
            case CLexer.Less:
            case CLexer.LessEqual:
            case CLexer.Greater:
            case CLexer.GreaterEqual:
            case CLexer.StarAssign:
            case CLexer.LeftShift:
            case CLexer.RightShift:
            case CLexer.AndAnd:
            case CLexer.OrOr:
            case CLexer.Mod:
            case CLexer.PlusAssign:
            case CLexer.DivAssign:
            case CLexer.AndAssign:
            case CLexer.MinusAssign:
            case CLexer.ModAssign:
            case CLexer.OrAssign:
            case CLexer.XorAssign:
            case CLexer.LeftShiftAssign:
            case CLexer.RightShiftAssign:
                if (parentNode instanceof ASTBinaryExpression)
                {
                    ((ASTBinaryExpression) parentNode).op = new ASTToken(node.getSymbol().getText(),
                            node.getSymbol().getTokenIndex());
                }
                else if (parentNode instanceof ASTUnaryExpression)
                {
                    ((ASTUnaryExpression) parentNode).op = new ASTToken(node.getSymbol().getText(),
                            node.getSymbol().getTokenIndex());
                }
                break;
            case CLexer.PlusPlus:
            case CLexer.MinusMinus:
            case CLexer.Tilde:
            case CLexer.Not:
            case CLexer.Caret:
            case CLexer.Or:
            case CLexer.And:
                if (parentNode instanceof ASTPostfixExpression)
                {
                    ((ASTPostfixExpression) parentNode).op = new ASTToken(node.getSymbol().getText(),
                            node.getSymbol().getTokenIndex());
                }
                else if (parentNode instanceof ASTUnaryExpression)
                {
                    ((ASTUnaryExpression) parentNode).op = new ASTToken(node.getSymbol().getText(),
                            node.getSymbol().getTokenIndex());
                }
                break;
            default:
                break;
        }
    }

    public WzcListenr()
    {
        returNode = new ASTCompilationUnit();
        nodeStack = new Stack<ASTNode>();
    }

    @Override
    public void enterCompilationUnit(CompilationUnitContext ctx)
    {
        nodeStack.push(returNode);
    }

    @Override
    public void enterFunctionDefinition(FunctionDefinitionContext ctx)
    {
        nodeStack.push(new ASTFunctionDefine());
    }

    @Override
    public void exitFunctionDefinition(FunctionDefinitionContext ctx)
    {
        thisNode = nodeStack.pop();
        parentNode = nodeStack.peek();
        // parentNode.(thisNode);
        if (parentNode.getClass() == ASTCompilationUnit.class)
        {
            ((ASTCompilationUnit) parentNode).items.add(thisNode);
            ((ASTCompilationUnit) parentNode).children.add(thisNode);
        }
    }

    @Override
    public void enterFunctionDeclarator(FunctionDeclaratorContext ctx)
    {
        nodeStack.push(new ASTFunctionDeclarator());
    }

    @Override
    public void exitFunctionDeclarator(FunctionDeclaratorContext ctx)
    {
        thisNode = nodeStack.pop();
        parentNode = nodeStack.peek();

        if (parentNode.getClass() == ASTFunctionDefine.class)
        {
            ((ASTFunctionDefine) parentNode).declarator = (ASTDeclarator) thisNode;
        }
        else if (parentNode.getClass() == ASTInitList.class)
        {
            ((ASTInitList) parentNode).declarator = (ASTDeclarator) thisNode;
        }
        else if (parentNode.getClass() == ASTParamsDeclarator.class)
        {
            ((ASTParamsDeclarator) parentNode).declarator = (ASTDeclarator) thisNode;
        }
    }

    @Override
    public void enterVariableDeclarator(VariableDeclaratorContext ctx)
    {
        nodeStack.push(new ASTVariableDeclarator());
    }

    @Override
    public void exitVariableDeclarator(VariableDeclaratorContext ctx)
    {
        thisNode = nodeStack.pop();
        parentNode = nodeStack.peek();
        // parentNode.(thisNode);
        if (parentNode.getClass() == ASTFunctionDeclarator.class)
        {
            ((ASTFunctionDeclarator) parentNode).declarator = (ASTVariableDeclarator) thisNode;
        }
        else if (parentNode.getClass() == ASTParamsDeclarator.class)
        {
            ((ASTParamsDeclarator) parentNode).declarator = (ASTDeclarator) thisNode;
        }
        else if (parentNode.getClass() == ASTInitList.class)
        {
            ((ASTInitList) parentNode).declarator = (ASTDeclarator) thisNode;
        }
        else if (parentNode.getClass() == ASTArrayDeclarator.class)
        {
            ((ASTArrayDeclarator) parentNode).declarator = (ASTDeclarator) thisNode;
        }
    }

    @Override
    public void enterArrayDeclarator(ArrayDeclaratorContext ctx)
    {
        nodeStack.push(new ASTArrayDeclarator());
    }

    @Override
    public void exitArrayDeclarator(ArrayDeclaratorContext ctx)
    {
        thisNode = nodeStack.pop();
        parentNode = nodeStack.peek();
        // parentNode.(thisNode);
        if (parentNode.getClass() == ASTFunctionDeclarator.class)
        {
            ((ASTFunctionDeclarator) parentNode).declarator = (ASTVariableDeclarator) thisNode;
        }
        else if (parentNode.getClass() == ASTParamsDeclarator.class)
        {
            ((ASTParamsDeclarator) parentNode).declarator = (ASTDeclarator) thisNode;
        }
        else if (parentNode.getClass() == ASTArrayDeclarator.class)
        {
            ((ASTArrayDeclarator) parentNode).declarator = (ASTDeclarator) thisNode;
        }
        else if (parentNode.getClass() == ASTInitList.class)
        {
            ((ASTInitList) parentNode).declarator = (ASTDeclarator) thisNode;
        }
    }

    @Override
    public void enterDeclaration(DeclarationContext ctx)
    {
        nodeStack.push(new ASTDeclaration());

    }

    @Override
    public void exitDeclaration(DeclarationContext ctx)
    {
        thisNode = nodeStack.pop();
        parentNode = nodeStack.peek();
        // parentNode.(thisNode);
        if (parentNode.getClass() == ASTCompilationUnit.class)
        {
            ((ASTCompilationUnit) parentNode).items.add((ASTDeclaration) thisNode);
        }
        else if (parentNode.getClass() == ASTCompoundStatement.class)
        {
            ((ASTCompoundStatement) parentNode).blockItems.add(thisNode);
        }
        else if (parentNode.getClass() == ASTIterationDeclaredStatement.class)
        {
            ((ASTIterationDeclaredStatement) parentNode).init = (ASTDeclaration) thisNode;
        }

    }

    // for declaration的直接重用
    @Override
    public void enterForDeclaration(ForDeclarationContext ctx)
    {
        enterDeclaration(null);
    }

    @Override
    public void exitForDeclaration(ForDeclarationContext ctx)
    {
        exitDeclaration(null);
    }

    @Override
    public void enterInitDeclarator(InitDeclaratorContext ctx)
    {
        ASTInitList astInitList = new ASTInitList();
        astInitList.exprs = new LinkedList<>();
        nodeStack.push(astInitList);
    }

    @Override
    public void exitInitDeclarator(InitDeclaratorContext ctx)
    {

        thisNode = nodeStack.pop();
        parentNode = nodeStack.peek();
        if (parentNode.getClass() == ASTDeclaration.class)
        {
            if (((ASTDeclaration) parentNode).initLists == null)
            {
                ((ASTDeclaration) parentNode).initLists = new LinkedList<ASTInitList>();
            }
            ((ASTDeclaration) parentNode).initLists.add((ASTInitList) thisNode);
        }

    }

    @Override
    public void enterParameterDeclaration(ParameterDeclarationContext ctx)
    {
        nodeStack.push(new ASTParamsDeclarator());
    }

    @Override
    public void enterIterationStatement_(IterationStatement_Context ctx)
    {
        nodeStack.push(new ASTIterationStatement());
    }

    @Override
    public void exitIterationDeclaredStatement_(IterationDeclaredStatement_Context ctx)
    {
        exitNormalStatement();
    }

    @Override
    public void enterIterationDeclaredStatement_(IterationDeclaredStatement_Context ctx)
    {
        nodeStack.push(new ASTIterationDeclaredStatement());
    }

    @Override
    public void exitIterationStatement_(IterationStatement_Context ctx)
    {
        exitNormalStatement();
    }

    @Override
    public void enterSelectionStatement(SelectionStatementContext ctx)
    {
        ASTSelectionStatement astSelectionStatement = new ASTSelectionStatement();
        astSelectionStatement.cond = new LinkedList<>();
        nodeStack.push(astSelectionStatement);
    }

    @Override
    public void exitSelectionStatement(SelectionStatementContext ctx)
    {
        exitNormalStatement();
    }

    @Override
    public void enterBreakStatement(BreakStatementContext ctx)
    {
        nodeStack.push(new ASTBreakStatement());
    }

    @Override
    public void exitBreakStatement(BreakStatementContext ctx)
    {
        exitNormalStatement();
    }

    @Override
    public void enterGotoStatement(GotoStatementContext ctx)
    {
        nodeStack.push(new ASTGotoStatement());
    }

    @Override
    public void exitGotoStatement(GotoStatementContext ctx)
    {
        exitNormalStatement();
    }

    @Override
    public void enterContinueStatement(ContinueStatementContext ctx)
    {
        nodeStack.push(new ASTContinueStatement());
    }

    @Override
    public void exitContinueStatement(ContinueStatementContext ctx)
    {
        exitNormalStatement();
    }

    @Override
    public void enterReturnStatement(ReturnStatementContext ctx)
    {
        nodeStack.push(new ASTReturnStatement());
    }

    @Override
    public void exitReturnStatement(ReturnStatementContext ctx)
    {
        exitNormalStatement();
        // todo:记得保证exitNormalStatement的挂载过程不会改变thisNode的值！(如果想维持强稳定，则需要在这里手动在进入exitNormalStatement的时候维护一下它的指针
        if (((ASTReturnStatement) thisNode).expr.size() == 0)
        {
            ((ASTReturnStatement) thisNode).expr = null;
        }
    }

    @Override
    public void enterLabeledStatement(LabeledStatementContext ctx)
    {
        nodeStack.push(new ASTLabeledStatement());
    }

    @Override
    public void exitLabeledStatement(LabeledStatementContext ctx)
    {
        exitNormalStatement();
    }

    @Override
    public void enterExpressionStatement(ExpressionStatementContext ctx)
    {
        nodeStack.push(new ASTExpressionStatement());
    }

    @Override
    public void exitExpressionStatement(ExpressionStatementContext ctx)
    {
        exitNormalStatement();
    }

    void exitNormalStatement()
    {
        thisNode = nodeStack.pop();
        parentNode = nodeStack.peek();

        if (parentNode.getClass() == ASTCompoundStatement.class)
        {
            ((ASTCompoundStatement) parentNode).blockItems.add(thisNode);
        }
        else if (parentNode.getClass() == ASTFunctionDefine.class)
        {
            ((ASTFunctionDefine) parentNode).body = (ASTCompoundStatement) thisNode;
        }
        else if (parentNode.getClass() == ASTSelectionStatement.class)
        {
            if (((ASTSelectionStatement) parentNode).then == null)
            {
                ((ASTSelectionStatement) parentNode).then = (ASTStatement) thisNode;
            }
            else
            {
                ((ASTSelectionStatement) parentNode).otherwise = (ASTStatement) thisNode;
            }
        }
        else if (parentNode.getClass() == ASTLabeledStatement.class)
        {
            ((ASTLabeledStatement) parentNode).stat = (ASTStatement) thisNode;
        }
        else if (parentNode.getClass() == ASTIterationDeclaredStatement.class)
        {
            ((ASTIterationDeclaredStatement) parentNode).stat = (ASTStatement) thisNode;
        }
        else if (parentNode.getClass() == ASTIterationStatement.class)
        {
            ((ASTIterationStatement) parentNode).stat = (ASTStatement) thisNode;
        }
    }

    @Override
    public void enterCompoundStatement(CompoundStatementContext ctx)
    {
        nodeStack.push(new ASTCompoundStatement());
    }

    // compoundStatement比较特殊,不走那里
    @Override
    public void exitCompoundStatement(CompoundStatementContext ctx)
    {
        exitNormalStatement();
    }

    @Override
    public void exitParameterDeclaration(ParameterDeclarationContext ctx)
    {
        thisNode = nodeStack.pop();
        parentNode = nodeStack.peek();
        if (parentNode.getClass() == ASTFunctionDeclarator.class)
        {
            if (((ASTFunctionDeclarator) parentNode).params == null)
            {
                ((ASTFunctionDeclarator) parentNode).params = new LinkedList<ASTParamsDeclarator>();
            }
            ((ASTFunctionDeclarator) parentNode).params.add((ASTParamsDeclarator) thisNode);
        }
    }

    public void findExpressionToMount(ASTExpression thisNode1, ASTExpression parentNode)
    {
        // 上一级的
        // binary 的符号要在token那里挂载
        if (parentNode.getClass() == ASTBinaryExpression.class)
        {
            ASTBinaryExpression binaryExpression = (ASTBinaryExpression) parentNode;
            if (binaryExpression.expr1 == null)
            {
                binaryExpression.expr1 = thisNode1;
            }
            else
            {

                binaryExpression.expr2 = thisNode1;
            }
        }
        else if (parentNode.getClass() == ASTConditionExpression.class)
        {

        }
        else if (parentNode.getClass() == ASTCastExpression.class)
        {
            ASTCastExpression castExpression = (ASTCastExpression) parentNode;
            castExpression.expr = thisNode1;
        }
        else if (parentNode.getClass() == ASTUnaryExpression.class)
        {
            ASTUnaryExpression unaryExpression = (ASTUnaryExpression) parentNode;
            unaryExpression.expr = (ASTExpression) thisNode1;
        }
        else if (parentNode.getClass() == ASTFunctionCall.class)
        {
            ASTFunctionCall functionCall = (ASTFunctionCall) parentNode;
            if (functionCall.funcname == null)
            {
                functionCall.funcname = thisNode1;
            }
            else
            {
                if (functionCall.argList == null)
                {
                    functionCall.argList = new LinkedList<>();
                }
                functionCall.argList.add((ASTExpression) thisNode1);
            }
        }
        else if (parentNode.getClass() == ASTPostfixExpression.class)
        {
            ASTPostfixExpression postfixExpression = (ASTPostfixExpression) parentNode;
            postfixExpression.expr = (ASTExpression) thisNode1;
        }
        else if (parentNode.getClass() == ASTArrayAccess.class)
        {
            ASTArrayAccess arrayAccess = (ASTArrayAccess) parentNode;
            if (arrayAccess.arrayName == null)
            {
                arrayAccess.arrayName = (ASTExpression) thisNode1;
            }
            else
            {
                arrayAccess.elements.add(thisNode1);
            }
        }

    }

    public void mountNonExpression(ASTExpression thisNode, ASTNode parentNode)
    {
        // 把需要一个expression的非expression节点都放这里来
        if (parentNode.getClass() == ASTExpressionStatement.class)
        {
            if (((ASTExpressionStatement) parentNode).exprs == null)
            {
                ((ASTExpressionStatement) parentNode).exprs = new LinkedList<>();
            }
            ((ASTExpressionStatement) parentNode).exprs.add(thisNode);
        }
        else if (parentNode.getClass() == ASTInitList.class)
        {
            if (((ASTInitList) parentNode).exprs == null)
            {
                ((ASTInitList) parentNode).exprs = new LinkedList<>();
            }
            ((ASTInitList) parentNode).exprs.add(thisNode);
        }
        else if (parentNode.getClass() == ASTReturnStatement.class)
        {
            if (((ASTReturnStatement) parentNode).expr == null)
            {
                ((ASTReturnStatement) parentNode).expr = new LinkedList<>();
            }
            ((ASTReturnStatement) parentNode).expr.add(thisNode);
        }
        else if (parentNode.getClass() == ASTSelectionStatement.class)
        {
            if (((ASTSelectionStatement) parentNode).cond == null)
            {
                ((ASTSelectionStatement) parentNode).cond = new LinkedList<>();
            }
            ((ASTSelectionStatement) parentNode).cond.add(thisNode);
        }
        else if (parentNode.getClass() == ASTIterationDeclaredStatement.class)
        {
            if (((ASTIterationDeclaredStatement) parentNode).cond == null)
            {
                ((ASTIterationDeclaredStatement) parentNode).cond = new LinkedList<>();
                ((ASTIterationDeclaredStatement) parentNode).cond.add(thisNode);
            }
            else if (((ASTIterationDeclaredStatement) parentNode).step == null)
            {
                ((ASTIterationDeclaredStatement) parentNode).step = new LinkedList<>();
                ((ASTIterationDeclaredStatement) parentNode).step.add(thisNode);
            }
        }

        // 新加的，没测试
        else if (parentNode.getClass() == ASTIterationStatement.class)
        {
            if (((ASTIterationStatement) parentNode).init == null)
            {
                ((ASTIterationStatement) parentNode).init = new LinkedList<>();
                ((ASTIterationStatement) parentNode).init.add(thisNode);
            }
            else if (((ASTIterationStatement) parentNode).cond == null)
            {
                ((ASTIterationStatement) parentNode).cond = new LinkedList<>();
                ((ASTIterationStatement) parentNode).cond.add(thisNode);
            }
            else if (((ASTIterationStatement) parentNode).step == null)
            {
                ((ASTIterationStatement) parentNode).step = new LinkedList<>();
                ((ASTIterationStatement) parentNode).step.add(thisNode);
            }
        }
    }

    @Override
    public void enterAssignmentExpression_(AssignmentExpression_Context ctx)
    {
        nodeStack.push(new ASTBinaryExpression());
    }

    @Override
    public void enterEqualityExpression_(EqualityExpression_Context ctx)
    {
        nodeStack.push(new ASTBinaryExpression());
    }

    @Override
    public void enterRelationalExpression_(RelationalExpression_Context ctx)
    {
        nodeStack.push(new ASTBinaryExpression());
    }

    @Override
    public void enterShiftExpression_(ShiftExpression_Context ctx)
    {
        nodeStack.push(new ASTBinaryExpression());
    }

    @Override
    public void enterAdditiveExpression_(AdditiveExpression_Context ctx)
    {
        nodeStack.push(new ASTBinaryExpression());
    }

    @Override
    public void enterMultiplicativeExpression_(MultiplicativeExpression_Context ctx)
    {
        nodeStack.push(new ASTBinaryExpression());
    }

    public void exitExpressionNode()
    {
        thisNode = nodeStack.pop();
        parentNode = nodeStack.peek();
        if (parentNode instanceof ASTExpression)
        {
            findExpressionToMount((ASTExpression) thisNode, (ASTExpression) parentNode);
        }
        else
        {
            mountNonExpression((ASTExpression) thisNode, parentNode);
        }
    }

    @Override
    public void exitShiftExpression_(ShiftExpression_Context ctx)
    {
        exitExpressionNode();
    }

    @Override
    public void exitAssignmentExpression_(AssignmentExpression_Context ctx)
    {
        exitExpressionNode();
    }

    @Override
    public void exitEqualityExpression_(EqualityExpression_Context ctx)
    {
        exitExpressionNode();
    }

    @Override
    public void exitRelationalExpression_(RelationalExpression_Context ctx)
    {
        exitExpressionNode();
    }

    @Override
    public void exitAdditiveExpression_(AdditiveExpression_Context ctx)
    {
        exitExpressionNode();
    }

    @Override
    public void exitMultiplicativeExpression_(MultiplicativeExpression_Context ctx)
    {
        exitExpressionNode();
    }

    @Override
    public void exitUnaryExpression_(UnaryExpression_Context ctx)
    {
        exitExpressionNode();
    }

    @Override
    public void exitLogicalAndExpression_(LogicalAndExpression_Context ctx)
    {
        exitExpressionNode();
    }

    @Override
    public void exitLogicalOrExpression_(LogicalOrExpression_Context ctx)
    {
        exitExpressionNode();
    }

    @Override
    public void enterUnaryExpression_(UnaryExpression_Context ctx)
    {
        nodeStack.push(new ASTUnaryExpression());
    }

    @Override
    public void enterLogicalOrExpression_(LogicalOrExpression_Context ctx)
    {
        nodeStack.push(new ASTBinaryExpression());
    }

    @Override
    public void enterLogicalAndExpression_(LogicalAndExpression_Context ctx)
    {
        nodeStack.push(new ASTBinaryExpression());
    }

    @Override
    public void enterFunctionCall_(FunctionCall_Context ctx)
    {
        ASTFunctionCall astFunctionCall = new ASTFunctionCall();
        astFunctionCall.argList = new LinkedList<>();
        nodeStack.push(astFunctionCall);
    }

    @Override
    public void exitFunctionCall_(FunctionCall_Context ctx)
    {
        exitExpressionNode();
    }

    @Override
    public void enterPostfixExpression_(PostfixExpression_Context ctx)
    {
        nodeStack.push(new ASTPostfixExpression());
    }

    @Override
    public void exitPostfixExpression_(PostfixExpression_Context ctx)
    {
        exitExpressionNode();
    }

    @Override
    public void enterArrayAceess_(ArrayAceess_Context ctx)
    {
        ASTArrayAccess arrayAccess = new ASTArrayAccess();
        arrayAccess.elements = new LinkedList<>();
        nodeStack.push(arrayAccess);
    }

    @Override
    public void exitArrayAceess_(ArrayAceess_Context ctx)
    {
        exitExpressionNode();
    }

}

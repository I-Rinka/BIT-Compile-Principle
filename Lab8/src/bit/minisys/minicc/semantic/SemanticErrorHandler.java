package bit.minisys.minicc.semantic;

public class SemanticErrorHandler
{
    public static void ES01(boolean isIdentifier, String Name)
    {
        if (isIdentifier)
        {
            System.out.println("ES01 >> Identifier: " + Name + " is not defined.\n");
        }
        else
        {
            System.out.println("ES01 >> Function: " + Name + " is not defined.\n");
        }
    }

    public static void ES02(boolean isIdentifier, String Name)
    {
        if (isIdentifier)
        {
            System.out.println("ES02 >> Declaration: " + Name + " has been declared.\n");
        }
        else
        {
            System.out.println("ES02 >> Function: " + Name + " has been declared.\n");
        }
    }

    public static void ES03()
    {
        System.out.println("ES3 >> BreakStatement: must be in a LoopStatement.\n");
    }

    public static void ES04(String func_name)
    {
        System.out.println("ES4 >> FunctionCall:" + func_name + "'s param type is not matched.");
    }

    public static void ES05(String op)
    {
        if (op.equals("<<") || op.equals(">>"))
        {
            System.out.println("ES5 >> BinaryExpression:(<< >> & | ^) expression's should be int.\n");
        }
        else
        {
            System.out.println("ES5 >> Expression Type Incompatible.\n");
        }
    }

    public static void ES06()
    {
        System.out.println("ES6 >> ArrayAccess:Out of Bounds.\n");
    }

    public static void ES07(String label)
    {
        System.out.println("ES7 >> Label:" + label + " is not defined.");
    }

    public static void ES08(String func_name)
    {
        System.out.println("ES08 >> Function: " + func_name + " must have a return in the end.\n");
    }
}

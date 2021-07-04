package bit.minisys.minicc.ncgen.IR.Symbol;

import bit.minisys.minicc.semantic.SemanticErrorHandler;

public class Sy_Func implements Sy_Item
{
    String func_name = null;
    String func_type = null;
    public int params_number = 0;

    public String[] func_para_type;

    public Sy_Func(String name, String func_rt_ltype)
    {
        this.func_name = name;
        this.func_para_type = new String[]{};
        this.func_type = func_rt_ltype;
        this.params_number = 0;
    }

    public Sy_Func(String name, String func_rt_ltype, String[] param_type)
    {
        this.func_name = name;
        this.func_para_type = param_type;
        this.func_type = func_rt_ltype;
        this.params_number = param_type.length;
    }

    public String CallFunction(String[] params)
    {
        String rt_str = "call" + " " + func_type + " @" + func_name;
        if (params.length != func_para_type.length)
        {
            SemanticErrorHandler.ES04(func_name);
        }
        rt_str += "(";
        for (int i = 0; i < params.length; i++)
        {
            if (i != 0)
            {
                rt_str += ", ";
            }
            rt_str += func_para_type[i] + " " + params[i];
        }
        return rt_str + ")";
    }

    public boolean FunctionCheck(String[] para_type, String[] params)
    {
        if (params.length != func_para_type.length)
        {
            SemanticErrorHandler.ES04(func_name);
            return false;
        }
        if (func_para_type.length != para_type.length)
        {
            SemanticErrorHandler.ES04(func_name);
            return false;
        }
        for (int i = 0; i < para_type.length; i++)
        {
            if (!para_type[i].equals(func_para_type[i]))
            {
                SemanticErrorHandler.ES04(func_name);
                return false;
            }
        }
        return true;
    }

    @Override
    public String GetName()
    {
        return func_name;
    }

    @Override
    public String GetLType()
    {
        return func_type;
    }
}

package bit.minisys.minicc.ncgen.IR.IRInstruction;

import bit.minisys.minicc.ncgen.IR.Symbol.Sy_Func;

public class IR_call implements IR_instruction
{
    public String dest = null;
    String type;
    public String func_name;
    public String[] para_list;
    Sy_Func target_function;

    public IR_call(String dest, Sy_Func target_function, String[] para_list)
    {
        this.dest = dest;
        this.type = target_function.GetLType();
        this.func_name = target_function.GetName();
        this.para_list = para_list;
        this.target_function = target_function;
    }

    public IR_call(String dest, Sy_Func target_function, String[] para_list, String[] para_type)
    {
        this.dest = dest;
        this.type = target_function.GetLType();
        this.func_name = target_function.GetName();
        this.para_list = para_list;
        this.target_function = target_function;
        target_function.FunctionCheck(para_type, para_list);
    }

    @Override
    public String toString()
    {
        String rt_str = "";
        if (dest != null)
        {
            rt_str += dest + " = ";
        }

        rt_str += target_function.CallFunction(para_list); //如果参数不对的话，java会在这里报错
        return rt_str;
    }
}

package bit.minisys.minicc.ncgen.IR.IRInstruction;

import bit.minisys.minicc.ncgen.IR.Symbol.Sy_Func;

public class IR_gobal_funcdec implements IR_instruction
{
    String type;
    Sy_Func target_function;

    public IR_gobal_funcdec(Sy_Func target_function)
    {
        this.type = target_function.GetLType();
        this.target_function = target_function;
    }

    @Override
    public String toString()
    {
        String rt_str = "declare" + " " + target_function.GetLType() + " " + "@" + target_function.GetName() + "(";
        int count = 0;
        for (String type :
                target_function.func_para_type)
        {
            if (count != 0)
            {
                rt_str += ", ";
            }
            rt_str += type;
            count++;
        }
        rt_str += ") #0"; //如果参数不对的话，java会在这里报错
        return rt_str;
    }
}

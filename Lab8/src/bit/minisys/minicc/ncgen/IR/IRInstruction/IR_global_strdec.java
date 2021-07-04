package bit.minisys.minicc.ncgen.IR.IRInstruction;

import bit.minisys.minicc.ncgen.IR.Symbol.Sy_Str;

public class IR_global_strdec implements IR_instruction
{
    public Sy_Str str_name;

    public IR_global_strdec(Sy_Str str)
    {
        this.str_name = str;
    }

    @Override
    public String toString()
    {
        return "@" + str_name.GetName() + " = " + str_name.GetLType() + " " + str_name.content + "\n";
    }

    int GetLen()
    {
        return str_name.content.length();
    }

    String GetName()
    {
        return str_name.GetName();
    }

    String GetContent()
    {
        return "\"" + str_name + "\"";
    }
}

package bit.minisys.minicc.ncgen.IR.IRInstruction;

public class IR_alloca implements IR_instruction
{
    public String dest;
    public String type;
    public String postfix = null;

    public IR_alloca(String dest, String ltype)
    {
        this.dest = dest;
        this.type = ltype;
    }

    @Override
    public String toString()
    {
        if (postfix != null)
        {
            return dest + " = " + "alloca " + type + ", " + postfix;
        }
        return dest + " = " + "alloca " + type;
    }
}

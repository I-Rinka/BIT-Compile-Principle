package bit.minisys.minicc.ncgen.IR.IRInstruction;

public class IR_store implements IR_instruction
{
    String type;
    public String src;
    public String dest;
    public String postfix;

    public IR_store(String type, String src, String dest)
    {
        this.type = type;
        this.src = src;
        this.dest = dest;
    }

    @Override
    public String toString()
    {
        String rt_string = "store";
        rt_string = rt_string + " " + type + " " + src + ", " + type + "*" + " " + dest;
        if (postfix != null)
        {
            rt_string += ", " + postfix;
        }
        return rt_string;
    }
}

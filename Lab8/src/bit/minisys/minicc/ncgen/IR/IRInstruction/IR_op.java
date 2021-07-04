package bit.minisys.minicc.ncgen.IR.IRInstruction;

public class IR_op implements IR_instruction
{
    public String dest;
    public String op;
    public String prefix1 = null;
    String type;
    public String src1;
    public String src2;
    public String postfix = null;

    public IR_op(String dest, String op, String ltype, String src1, String src2)
    {
        this.dest = dest;
        this.type = ltype;
        this.op = op;
        this.src1 = src1;
        this.src2 = src2;
    }

    @Override
    public String toString()
    {
        String rt_str = "";
        rt_str += dest + " " + "=" + " " + op + " ";
        if (prefix1 != null)
        {
            rt_str += prefix1 + " ";
        }
        rt_str += type + " " + src1;
        rt_str += ", " + src2;
        if (postfix != null)
        {
            rt_str += ", " + postfix;
        }
        return rt_str;
    }
}

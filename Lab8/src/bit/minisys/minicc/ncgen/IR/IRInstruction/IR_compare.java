package bit.minisys.minicc.ncgen.IR.IRInstruction;

public class IR_compare implements IR_instruction
{
    String dest;
    public String op;
    String type;
    public String src1;
    public String src2;

    public IR_compare(String dest, String op, String ltype, String src1, String src2)
    {
        this.dest = dest;
        this.op = op;
        this.type = ltype;
        this.src1 = src1;
        this.src2 = src2;
    }

    @Override
    public String toString()
    {
        String rt_str = "" + dest + " = " + "icmp" + " " + op + " " + type + " " + src1 + ", " + src2;
        return rt_str;
    }
}

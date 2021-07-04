package bit.minisys.minicc.ncgen.IR.IRInstruction;

public class IR_branch implements IR_instruction
{
    public IR_instruction ins_pointer = null;
    public boolean is_conditional = false;
    public String dest = null;

    public IR_branch(String dest)
    {
        this.dest = dest;
    }

    String cond = null;
    public String true_dest;
    public String false_dest;

    public IR_branch(String cond, String true_dest, String false_dest)
    {
        is_conditional = true;
        this.cond = cond;
        this.true_dest = true_dest;
        this.false_dest = false_dest;
    }

    @Override
    public String toString()
    {
        if (dest == null)
        {
            return "br" + " i1 " + cond + ", " + "label " + true_dest + ", label " + false_dest;
        }
        return "br" + " label " + dest;
    }
}

package bit.minisys.minicc.ncgen.IR.IRInstruction;

public class IR_tag implements IR_instruction
{
    public String target_label;

    public IR_tag(String dest_label)
    {
        this.target_label = dest_label;
    }

    @Override
    public String toString()
    {
        return target_label + ":";
    }
}

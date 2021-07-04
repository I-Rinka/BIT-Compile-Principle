package bit.minisys.minicc.ncgen.ISA.RISCV.instructions;

public class RV_tag implements RV_instruction
{
    public String tag_name;
    public boolean print = true;

    public RV_tag(String tag_name)
    {
        this.tag_name = tag_name;
    }

    @Override
    public String toString()
    {
        if (print)
        {
            return tag_name + ":" + "\n";
        }
        return "";
    }
}

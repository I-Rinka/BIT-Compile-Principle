package bit.minisys.minicc.ncgen.ISA.RISCV.instructions;

public class RV_mv implements RV_instruction
{
    String dest;
    String src;

    public RV_mv(String dest, String src)
    {
        this.dest = dest;
        this.src = src;
    }

    @Override
    public String toString()
    {
        return "mv " + dest + "," + src + "\n";
    }
}

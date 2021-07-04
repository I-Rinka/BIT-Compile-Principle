package bit.minisys.minicc.ncgen.ISA.RISCV.instructions;

public class RV_load implements RV_instruction
{
    int offset;
    String base_reg;
    String dest_reg;

    public RV_load(String dest_reg, String base_reg, int offset)
    {
        this.dest_reg = dest_reg;
        this.base_reg = base_reg;
        this.offset = offset;
    }

    @Override
    public String toString()
    {
        return "lw" + " " + dest_reg + "," + offset + "(" + base_reg + ")" + "\n";
    }
}

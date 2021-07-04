package bit.minisys.minicc.ncgen.ISA.RISCV.instructions;

public class RV_store implements RV_instruction
{
    int offset;
    String base_reg;
    String src_reg;

    public RV_store(String src_reg, String base_reg, int offset)
    {
        this.src_reg = src_reg;
        this.base_reg = base_reg;
        this.offset = offset;
    }

    @Override
    public String toString()
    {
        return "sw" + " " + src_reg + "," + offset + "(" + base_reg + ")" + "\n";
    }
}

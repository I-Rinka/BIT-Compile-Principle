package bit.minisys.minicc.ncgen.ISA.RISCV.instructions;

public class RV_li extends RV_addi
{
    public RV_li(String dest_reg, int immediate)
    {
        super(dest_reg, "zero", immediate);
    }
}

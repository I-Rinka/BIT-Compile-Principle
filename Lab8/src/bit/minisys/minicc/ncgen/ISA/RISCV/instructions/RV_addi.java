package bit.minisys.minicc.ncgen.ISA.RISCV.instructions;

public class RV_addi extends RV_3addr_ins
{
    public RV_addi(String dest_reg, String src1_reg, int immediate)
    {
        super("addi", dest_reg, src1_reg, "" + immediate);
    }
}

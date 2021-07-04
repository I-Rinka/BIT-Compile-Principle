package bit.minisys.minicc.ncgen.ISA.RISCV.instructions;

public class RV_branch extends RV_3addr_ins
{
    public RV_branch(String op, String src1_reg, String src2_reg, String jmp_dest)
    {
        super(op, src1_reg, src2_reg, jmp_dest);
    }
}

package bit.minisys.minicc.ncgen.ISA.RISCV.instructions;

public class RV_3addr_ins implements RV_instruction
{
    String op;
    String dest_reg;
    String src1_reg;
    String src2_reg;

    public RV_3addr_ins(String op, String dest_reg, String src1_reg, String src2_reg)
    {
        this.op = op;
        this.dest_reg = dest_reg;
        this.src1_reg = src1_reg;
        this.src2_reg = src2_reg;
    }

    @Override
    public String toString()
    {
        return op + " " + dest_reg + "," + src1_reg + "," + src2_reg + "\n";
    }
}

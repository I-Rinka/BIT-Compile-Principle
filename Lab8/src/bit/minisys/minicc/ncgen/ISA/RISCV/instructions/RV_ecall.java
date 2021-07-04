package bit.minisys.minicc.ncgen.ISA.RISCV.instructions;

public class RV_ecall implements RV_instruction
{
    @Override
    public String toString()
    {
        return "ecall" + "\n";
    }
}

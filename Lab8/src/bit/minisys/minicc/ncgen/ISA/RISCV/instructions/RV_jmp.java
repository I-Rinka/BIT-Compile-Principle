package bit.minisys.minicc.ncgen.ISA.RISCV.instructions;

public class RV_jmp implements RV_instruction
{
    String dest;

    public RV_jmp(String dest)
    {
        this.dest = dest;
    }

    @Override
    public String toString()
    {
        return "jal x0," + dest+"\n";
    }
}

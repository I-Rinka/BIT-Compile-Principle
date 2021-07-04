package bit.minisys.minicc.ncgen.ISA.RISCV.instructions;

public class RV_call implements RV_instruction
{
    String func_name;

    public RV_call(String func_name)
    {
        this.func_name = func_name;
    }

    @Override
    public String toString()
    {
        return "call " + func_name + "\n";
    }
}

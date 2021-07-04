package bit.minisys.minicc.ncgen.ISA.RISCV.instructions;

public class RV_la implements RV_instruction
{
    String dest;
    String addr_name;

    public RV_la(String dest, String addr_name)
    {
        this.dest = dest;
        this.addr_name = addr_name;
    }

    @Override
    public String toString()
    {
        return "la"+" "+dest+","+addr_name+"\n";
    }
}

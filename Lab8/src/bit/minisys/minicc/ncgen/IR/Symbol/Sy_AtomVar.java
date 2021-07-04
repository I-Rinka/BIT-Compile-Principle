package bit.minisys.minicc.ncgen.IR.Symbol;

public class Sy_AtomVar implements Sy_Item
{
    String type = "void";
    String Name = "";
    public String reg_addr = "";

    public Sy_AtomVar(String name, String ltype, String reg_addr)
    {
        Name = name;
        type = ltype;
        this.reg_addr = reg_addr;
    }

    public Sy_AtomVar(String name)
    {
        Name = name;
    }

    @Override
    public String GetName()
    {
        return Name;
    }

    @Override
    public String GetLType()
    {
        return this.type;
    }
}

package bit.minisys.minicc.ncgen.IR.IRInstruction;

public class IR_ret implements IR_instruction
{
    String type = "void";
    public String value = null;

    public IR_ret()
    {
    }

    public IR_ret(String ltype, String rt_value)
    {
        this.type = ltype;
        this.value = rt_value;
    }

    @Override
    public String toString()
    {
        if (type.equals("void"))
        {
            return "ret void";
        }
        return "ret" + " " + type + " " + value;
    }
}

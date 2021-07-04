package bit.minisys.minicc.ncgen.IR.Symbol;

import bit.minisys.minicc.ncgen.IR.IRInstruction.IR_instruction;

public class Sy_Label implements Sy_Item
{
    public String dest_label_reg=null;
    public String label_name;
    public Sy_Label(String label_name, String dest_label_reg)
    {
        this.label_name=label_name;
        this.dest_label_reg=dest_label_reg;
    }
    @Override
    public String GetName()
    {
        return label_name;
    }

    @Override
    public String GetLType()
    {
        return null;
    }

    public IR_instruction GotoPointer=null;
}

package bit.minisys.minicc.ncgen;

import bit.minisys.minicc.ncgen.IR.IRInstruction.IR_instruction;

import java.util.LinkedList;

public interface WzcTargetMaker
{
    public String GetCodeHeader(LinkedList<IR_instruction> declaration);

    public String GetTargetCode();
}

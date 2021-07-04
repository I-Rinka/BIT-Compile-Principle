package bit.minisys.minicc.ncgen.BasicBlockInfo;

import bit.minisys.minicc.ncgen.IR.IRInstruction.IR_instruction;

import java.util.LinkedList;

public class FunctionContent
{
    public String name;
    public String ltype;
    public String head_str;
    public LinkedList<String> used_param;
    LinkedList<IR_instruction> InsBuffer;

    public FunctionContent(String func_name, LinkedList<IR_instruction> InsBuffer, LinkedList<String> used_param)
    {
        this.name = func_name;
        this.InsBuffer = InsBuffer;
        this.used_param = used_param;
    }

    public String GetFunctionIRString()
    {
        String out_str = head_str;
        //输出符号
        for (IR_instruction instruction :
                InsBuffer)
        {
            out_str += "  " + instruction.toString() + "\n";
        }
        return out_str + "}\n";
    }

    public LinkedList<IR_instruction> GetFunctionInstruction()
    {
        return InsBuffer;
    }
}

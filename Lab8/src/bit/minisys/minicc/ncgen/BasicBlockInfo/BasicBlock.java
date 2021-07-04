package bit.minisys.minicc.ncgen.BasicBlockInfo;

import bit.minisys.minicc.ncgen.IR.IRInstruction.IR_instruction;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class BasicBlock
{
    public String tag;
    public LinkedList<IR_instruction> DAGS;
    LinkedList<String> out_edge;
    LinkedList<String> in_edge;

    //todo: 实现load/store优化后进行活跃寄存器的扫描
    LinkedHashSet<String> IN_live_reg;
    LinkedHashSet<String> OUT_live_reg;

    LinkedHashSet<String> DEF_live_reg;
    LinkedHashSet<String> USE_live_reg;

    HashMap<String, Integer> VRegReleaseLine;//对应在当前DAG的行号 应该释放的行号：虚拟寄存器在右值最后一次出现。当在行号内却不释放的情况：此虚拟寄存器在基本块的出口处

    public HashMap<String, Integer> GetVRegReleaseInfo()
    {
        return VRegReleaseLine;
    }

    public BasicBlock()
    {
        this.DAGS = new LinkedList<>();
        this.out_edge = new LinkedList<>();
        this.in_edge = new LinkedList<>();

        this.IN_live_reg = new LinkedHashSet<>();
        this.OUT_live_reg = new LinkedHashSet<>();

        this.DEF_live_reg = new LinkedHashSet<>();
        this.USE_live_reg = new LinkedHashSet<>();
    }
}

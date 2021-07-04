package bit.minisys.minicc.ncgen.BasicBlockInfo;

import bit.minisys.minicc.ncgen.IR.IRInstruction.*;
import bit.minisys.minicc.ncgen.Util.JudgeConstant;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class WzcIRScanner //todo: 扫描基本块信息。信息既能被编译器利用，又能被LLVM优化器利用
{
    LinkedList<BasicBlock> BasicBlocks;
    //tag到basicBlock的映射表
    HashMap<String, BasicBlock> tagToBasicBlock;

    HashMap<String, Integer> AllocaRegOffset;//每一个alloca寄存器的栈区相对偏移量
    public Integer FuncAllocaCount = 0;

    public WzcIRScanner(LinkedList<IR_instruction> function_ins)
    {
        tagToBasicBlock = new HashMap<>();
        BasicBlocks = new LinkedList<>();
        BasicBlocks.add(new BasicBlock());
        tagToBasicBlock.put("0", BasicBlocks.getLast());
        BasicBlocks.getLast().tag = "0";

        for (IR_instruction instruct :
                function_ins)
        {
            if (instruct instanceof IR_tag)
            {
                BasicBlocks.add(new BasicBlock());
                BasicBlocks.getLast().tag = ((IR_tag) instruct).target_label;
                BasicBlocks.getLast().DAGS.add(((IR_tag) instruct));
                tagToBasicBlock.put(BasicBlocks.getLast().tag, BasicBlocks.getLast());
            }
            else if (instruct instanceof IR_branch)
            {
                //出边
                IR_branch branch = (IR_branch) instruct;
                if (branch.is_conditional)
                {
                    BasicBlocks.getLast().out_edge.add(branch.false_dest.substring(1));
                    BasicBlocks.getLast().out_edge.add(branch.true_dest.substring(1));
                }
                else
                {
                    BasicBlocks.getLast().out_edge.add(branch.dest.substring(1));
                }
                BasicBlocks.getLast().DAGS.add(instruct);
            }
            else
            {
                BasicBlocks.getLast().DAGS.add(instruct);
            }
        }

        for (BasicBlock basicBlock : BasicBlocks)
        {
            for (String tag : basicBlock.out_edge)
            {
                tagToBasicBlock.get(tag).in_edge.add(basicBlock.tag);
            }
        }

    }

    public LinkedList<BasicBlock> GetBasicBlocks()
    {
        return BasicBlocks;
    }

    public HashMap<String, Integer> GetAllocaMap() //获得函数栈区分配地址信息
    {
        return AllocaRegOffset;
    }

    //先扫描分配的变量 todo: 进行活跃寄存器分析
    public void ScanInfo()
    {
        LinkedList<BasicBlock> block_traverse = new LinkedList<>();
        block_traverse.push(BasicBlocks.getFirst());
        HashMap<BasicBlock, Boolean> hasVisited = new HashMap<>();
        this.AllocaRegOffset = new HashMap<>();
        //广度优先遍历
        while (true)
        {
            if (block_traverse.size() == 0)
            {
                break;
            }
            BasicBlock block = block_traverse.pollFirst();
            hasVisited.put(block, true);

            HashMap<String, Integer> VRegRleaseLine = new HashMap<>();
            //扫描本基本块
            for (int i = 0; i < block.DAGS.size(); i++)
            {
                //有右值虚拟寄存器出现的情况：IR_call,IR_compare,IR_store,IR_ret,IR_op. branch和cmp的i1并不是任何寄存器
                //同时扫描左值，左值在默认情况下即释放
                //右值不是寄存器的情况：在tagToBasicBlock中的“寄存器”，以及常量
                LinkedList<String> reg_array = new LinkedList<>();

                IR_instruction instruction = block.DAGS.get(i);
                if (instruction instanceof IR_compare)
                {
                    reg_array.add(((IR_compare) instruction).src1);
                    reg_array.add(((IR_compare) instruction).src2);
                }
                else if (instruction instanceof IR_call)
                {
                    if (((IR_call) instruction).dest != null)
                    {
                        VRegRleaseLine.put(((IR_call) instruction).dest, 0);
                        block.DEF_live_reg.add(((IR_call) instruction).dest);
                    }
                    reg_array.addAll(Arrays.asList(((IR_call) instruction).para_list));
                }
                else if (instruction instanceof IR_store) //store的dest已经在alloca中了
                {
                    reg_array.add(((IR_store) instruction).src);
                }
                else if (instruction instanceof IR_ret)
                {
                    if (((IR_ret) instruction).value != null)
                    {
                        reg_array.add(((IR_ret) instruction).value);
                    }
                }
                else if (instruction instanceof IR_op)
                {
                    if (((IR_op) instruction).dest != null)
                    {
                        VRegRleaseLine.put(((IR_op) instruction).dest, 0);
                        block.DEF_live_reg.add(((IR_op) instruction).dest);
                    }
                    reg_array.add(((IR_op) instruction).src1);
                    reg_array.add(((IR_op) instruction).src2);
                }
                else if (instruction instanceof IR_getelementptr)
                {
                    reg_array.add(((IR_getelementptr) instruction).offset);
                    reg_array.add(((IR_getelementptr) instruction).dest);
                }
                else if (instruction instanceof IR_alloca)
                {
                    if (((IR_alloca) instruction).dest != null)
                    {
//                        VRegRleaseLine.put(((IR_alloca) instruction).dest, 0); alloca的寄存器不应该被释放，因为它直接是地址
                        block.DEF_live_reg.add(((IR_alloca) instruction).dest);
                        if (((IR_alloca) instruction).type.contains("["))
                        {
                            LinkedList<Integer> size_info = GetPolyTypeSizeInfo(((IR_alloca) instruction).type);
                            int size = 1;
                            for (Integer sz :
                                    size_info)
                            {
                                size *= sz;
                            }
                            FuncAllocaCount += size;
                            AllocaRegOffset.put(((IR_alloca) instruction).dest, FuncAllocaCount); //如果alloca的是复合类型，那么需要增加复合类型的栈空间
                        }
                        else
                        {
                            FuncAllocaCount++;
                            AllocaRegOffset.put(((IR_alloca) instruction).dest, FuncAllocaCount); //如果alloca的是复合类型，那么需要增加复合类型的栈空间
                        }
                    }
                }

                //判断reg是不是常量
                for (String reg :
                        reg_array)
                {
                    if (!JudgeConstant.isNumeric(reg))
                    {
                        block.USE_live_reg.add(reg);
                        VRegRleaseLine.putIfAbsent(reg, i);
                        VRegRleaseLine.replace(reg, i); //更新到最后出现的一行
                    }
                }
                //todo: 当一个alloca的地址在后续基本块不被laod时，那个alloca的区域可以被覆盖掉(LLVM IR的优化)
                //todo: OUTlive和Inlive的支持
            }

            block.VRegReleaseLine = VRegRleaseLine;

            for (String block_tag :
                    block.out_edge)
            {
                BasicBlock nxt_block = tagToBasicBlock.get(block_tag);
                if (hasVisited.get(nxt_block) == null)
                {
                    block_traverse.push(nxt_block);
                }
            }
        }
    }

    LinkedList<Integer> GetPolyTypeSizeInfo(String poly)
    {
        LinkedList<Integer> rt_val = new LinkedList<>();
        StringBuilder builder = new StringBuilder(poly);
        while (true)
        {   //todo: 以后使用正则式解析
            int r = builder.indexOf(" x");
            if (r == -1)
            {
                break;
            }
            String size = builder.substring(1, r);
            rt_val.add(Integer.parseInt(size));
            builder.delete(0, r + 2);
        }
        return rt_val;
    }
}

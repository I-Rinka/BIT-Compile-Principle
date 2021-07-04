package bit.minisys.minicc.ncgen;

import bit.minisys.minicc.MiniCCCfg;
import bit.minisys.minicc.internal.util.MiniCCUtil;

public class WzcCodeGen implements IMiniCCCodeGen
{
    public WzcCodeGen()
    {

    }

    @Override
    public String run(String iFile, MiniCCCfg cfg) throws Exception
    {
        String oFile = MiniCCUtil.removeAllExt(iFile) + MiniCCCfg.MINICC_CODEGEN_OUTPUT_EXT;


        if (cfg.target.equals("mips"))
        {
            // TODO:
        }
        else if (cfg.target.equals("riscv"))
        {
            WzcCCompiler compiler = new WzcCCompiler(iFile);
            compiler.Compile(WzcCCompiler.target_arch.riscv, oFile);
        }
        else if (cfg.target.equals("x86"))
        {
            // TODO:
        }

        System.out.println("7. Target code generation finished!");

        return oFile;
    }
}

package bit.minisys.minicc.ncgen;

import bit.minisys.minicc.internal.util.MiniCCUtil;
import bit.minisys.minicc.ncgen.ISA.RISCV.RVMaker;
import bit.minisys.minicc.ncgen.IR.Symbol.Sy_Func;
import bit.minisys.minicc.parser.ast.ASTCompilationUnit;

import java.io.FileOutputStream;
import java.io.IOException;

public class WzcCCompiler
{
    String SourceFile;

    public enum target_arch
    {
        riscv,
        x86
    }

    public void Compile(target_arch arch, String OutFile_Path)
    {
        try
        {
            WzcParser parser = new WzcParser(SourceFile);
            ASTCompilationUnit ast_root = parser.GetParserRoot();

            WzcLLVM ir_gen = new WzcLLVM(ast_root);

            ir_gen.AddLibFunction(new Sy_Func("Mars_PrintStr", "void", new String[]{"i8*"}));
            ir_gen.AddLibFunction(new Sy_Func("Mars_GetInt", "i32", new String[]{}));
            ir_gen.AddLibFunction(new Sy_Func("Mars_PrintInt", "void", new String[]{"i32"}));

            ir_gen.Run();

            System.out.println("IR Outputes in " + MiniCCUtil.removeAllExt(OutFile_Path) + ".ll");
            ir_gen.GetIRCode();
            FileOutputStream fileOutputStreamll = new FileOutputStream(MiniCCUtil.removeAllExt(OutFile_Path) + ".ll");
            fileOutputStreamll.write(ir_gen.GetIRCode().getBytes());
            fileOutputStreamll.close();


            WzcTargetMaker maker = null;

            if (arch == target_arch.riscv)
            {
                maker = new RVMaker(ir_gen.GetFunctions(), ir_gen.GetGlobalDeclaration());
            }

            System.out.println("Compiled Code path: " + OutFile_Path);
            FileOutputStream fileOutputStream = new FileOutputStream(OutFile_Path);
            assert maker != null;
            fileOutputStream.write(maker.GetTargetCode().getBytes());
            fileOutputStream.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public WzcCCompiler(String SourceFile)
    {
        this.SourceFile = SourceFile;
    }
}
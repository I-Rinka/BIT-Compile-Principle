package bit.minisys.minicc.icgen;

import java.io.*;

import bit.minisys.minicc.MiniCCCfg;
import bit.minisys.minicc.ncgen.WzcLLVM;
import bit.minisys.minicc.parser.CLexer;
import bit.minisys.minicc.parser.CParser;

import bit.minisys.minicc.internal.util.MiniCCUtil;
import bit.minisys.minicc.parser.WzcListenr;
import bit.minisys.minicc.parser.ast.ASTCompilationUnit;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


import java.io.File;
import java.nio.charset.StandardCharsets;

public class WzcICGen implements IMiniCCICGen
{

    @Override
    public String run(String iFile) throws Exception
    {
        //直接从源文件读取
        System.out.println("LLVM-IR Generating..");

        String oFile = MiniCCUtil.removeAllExt(iFile) + ".ll";

        FileInputStream fileInputStream = new FileInputStream(iFile);
        // size 为字串的长度 ，这里一次性读完
        int size = fileInputStream.available();
        byte[] buffer = new byte[size];
        fileInputStream.read(buffer);
        fileInputStream.close();
        String str = new String(buffer, StandardCharsets.UTF_8);

        CharStream input = CharStreams.fromStream(new ByteArrayInputStream(str.getBytes()));

        Lexer lexer = new CLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);
        CParser parser = new CParser(tokens);

        parser.setErrorHandler(new BailErrorStrategy()); // 设置错误处理
        ParseTree root = parser.compilationUnit();

        WzcListenr listener = new WzcListenr();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, root);

        //输出AST
        ASTCompilationUnit ASTRoot = (ASTCompilationUnit) listener.returNode;
        System.out.println("AST Output: " + MiniCCUtil.removeAllExt(oFile) + MiniCCCfg.MINICC_PARSER_OUTPUT_EXT);
        FileOutputStream fileOutputStream = new FileOutputStream(MiniCCUtil.removeAllExt(oFile) + MiniCCCfg.MINICC_PARSER_OUTPUT_EXT);
        ObjectMapper mapper = new ObjectMapper();
        String outPutJson = mapper.writeValueAsString(listener.returNode);
        fileOutputStream.write(outPutJson.getBytes());
        fileOutputStream.close();

        //生成IR
        WzcLLVM IR = new WzcLLVM(ASTRoot);

        IR.Run();

        String target_data_layout = "e-m:e-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128";
        String target_triple = "x86_64-pc-linux-gnu";

        String LLVM_IR = IR.GetIRCode();

        //输出IR
        fileOutputStream = new FileOutputStream(oFile);
        fileOutputStream.write(LLVM_IR.getBytes());
        fileOutputStream.close();

        System.out.println("LLVM-IR Generated!");

        //输出AST
        System.out.println("LLVM-IR Output: " + oFile);
        return oFile;
    }

}

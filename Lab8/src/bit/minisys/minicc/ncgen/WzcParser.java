package bit.minisys.minicc.ncgen;

import bit.minisys.minicc.MiniCCCfg;
import bit.minisys.minicc.internal.util.MiniCCUtil;
import bit.minisys.minicc.parser.CLexer;
import bit.minisys.minicc.parser.CParser;
import bit.minisys.minicc.parser.WzcListenr;
import bit.minisys.minicc.parser.ast.ASTCompilationUnit;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WzcParser
{
    String C_source_code;

    public ASTCompilationUnit GetParserRoot() throws IOException
    {
        CharStream input = CharStreams.fromStream(new ByteArrayInputStream(C_source_code.getBytes()));

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
        return ASTRoot;
    }

    public WzcParser(String Cfile) throws IOException
    {
        //直接从源文件读取
        FileInputStream fileInputStream = new FileInputStream(Cfile);
        // size 为字串的长度 ，这里一次性读完
        int size = fileInputStream.available();
        byte[] buffer = new byte[size];
        fileInputStream.read(buffer);
        fileInputStream.close();
        C_source_code = new String(buffer, StandardCharsets.UTF_8);
    }
}

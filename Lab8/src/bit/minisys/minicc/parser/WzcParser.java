package bit.minisys.minicc.parser;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.http.WebSocket.Listener;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.antlr.v4.runtime.tree.ParseTreeListener;

import bit.minisys.minicc.MiniCCCfg;
import bit.minisys.minicc.internal.util.MiniCCUtil;
import bit.minisys.minicc.parser.ast.ASTCompilationUnit;
import bit.minisys.minicc.parser.ast.ASTExpression;
import bit.minisys.minicc.parser.ast.ASTFunctionCall;
import bit.minisys.minicc.parser.ast.ASTNode;
import bit.minisys.minicc.parser.ast.ASTVisitor;

public class WzcParser implements IMiniCCParser
{

    String code_source;

    public String run(String iFile) throws Exception
    {
        System.out.println("Parsering...");
        String ast_json_file = MiniCCUtil.removeAllExt(iFile) + MiniCCCfg.MINICC_PARSER_OUTPUT_EXT;

        // 显示语法树的功能砍掉

        // 往ast_json里面写东西 就不用json了，直接字符串走起

        FileOutputStream fileOutputStream = new FileOutputStream(ast_json_file);

        // ASTCompilationUnit p = new ASTCompilationUnit();
        // ArrayList<ASTNode> fl =new ArrayList<ASTNode>();
        // ASTFunctionCall fCall=new ASTFunctionCall();

        // 我们的工作就是遍历树，然后把相应节点推入队列

        // fl.add(fCall);
        // if(fl != null) {
        // p.items.add(fCall);
        // // p.items.addAll(fl);
        // }
        // p.children.addAll(p.items);

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
        // String[] dummyStrs = new String[16];
        // TreeViewer viewr = new TreeViewer(Arrays.asList(dummyStrs), listener.returNode);
        // viewr.open();

        ObjectMapper mapper = new ObjectMapper();

        String outPutJson = mapper.writeValueAsString(listener.returNode);

        System.out.println(outPutJson);

        fileOutputStream.write(outPutJson.getBytes());
        fileOutputStream.close();

        // 把下一个ast.json的名字给return了
        return ast_json_file;
    }
}

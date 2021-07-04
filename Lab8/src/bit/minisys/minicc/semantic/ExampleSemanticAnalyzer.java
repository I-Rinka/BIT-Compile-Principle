package bit.minisys.minicc.semantic;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import bit.minisys.minicc.parser.ast.ASTCompilationUnit;

public class ExampleSemanticAnalyzer implements IMiniCCSemantic
{

    //跳过这个，直接一遍编译。词法，语法，语义，中间代码一起做
    @Override
    public String run(String iFile) throws Exception
    {
//
//		ObjectMapper mapper = new ObjectMapper();
//		ASTCompilationUnit program = (ASTCompilationUnit) mapper.readValue(new File(iFile), ASTCompilationUnit.class);
//		System.out.println("in Semantic");

        /*
         * String[] dummyStrs = new String[16]; TreeViewer viewr = new
         * TreeViewer(Arrays.asList(dummyStrs), program);
         */

//		System.out.println(program.children);

        return null;
    }

}

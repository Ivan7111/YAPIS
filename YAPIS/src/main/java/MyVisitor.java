import gen.qweBaseVisitor;
import gen.qweLexer;
import gen.qweParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class MyVisitor extends qweBaseVisitor {
    @Override
    public Object visitProgram(qweParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Object visitStatement(qweParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Object visitAssign(qweParser.AssignContext ctx) {
        System.out.println(ctx.children);
        return super.visitAssign(ctx);
    }

    @Override
    public Object visitAdd(qweParser.AddContext ctx) {
        return super.visitAdd(ctx);
    }

    @Override
    public Object visitPrint(qweParser.PrintContext ctx) {
        return super.visitPrint(ctx);
    }

    public static void main(String[] args) {
        try {
            org.antlr.v4.runtime.CharStream input =
                    CharStreams.fromFileName("D:\\JavaProjects\\YAPIS\\src\\myCode.qwe");

            qweLexer lexer = new qweLexer(input);
            qweParser parser = new qweParser(new CommonTokenStream(lexer));

            qweParser.ProgramContext tree =   parser.program();
            //System.out.println(tree.children.get(1).getChild(0).getChild(1));
            MyVisitor visitor = new MyVisitor();
            visitor.visitProgram(tree);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

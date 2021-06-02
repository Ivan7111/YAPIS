package MyNode;

import gen.qweBaseListener;
import gen.qweLexer;
import gen.qweParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;

public class MyListenerTree extends qweBaseListener {
    public Node node = null;

    @Override
    public void exitBlockIf(qweParser.BlockIfContext ctx) {
        Node node1 = node.getParent();
        node = node1;

        Node node2 = new Node();
        node2.setValue("elseBlock");
        node2.setParent(node);
        node.addChildren(node2);

        node = node2;
    }

    @Override
    public void exitIfBody(qweParser.IfBodyContext ctx) {
        Node node1 = new Node();
        node1.setValue("ifStatement");

        Node node2 = new Node();
        Node node3 = new Node();

        Node node4 = new Node();
        Node node5 = new Node();

        Node node6 = new Node();
        Node node7 = new Node();

        node2.setValue("variable");
        node3.setValue(ctx.ID(0).getText());

        node4.setValue("MoreLess");
        node5.setValue(ctx.MoreLess().getText());
        if (ctx.ID().size() > 1){
            node6.setValue("variable");
            node7.setValue(ctx.ID(1).getText());
        } else {
            node6.setValue("value");
            node7.setValue(ctx.NUMBER().getText());
        }

        node2.addChildren(node3);
        node4.addChildren(node5);
        node6.addChildren(node7);

        node1.addChildren(node2);
        node1.addChildren(node4);
        node1.addChildren(node6);

        node.addChildren(node1);

        Node node8 = new Node();
        node8.setValue("ifBlock");

        node.addChildren(node8);
        node8.setParent(node);

        node = node8;
    }

    @Override
    public void enterProgram(qweParser.ProgramContext ctx) {
        node = new Node();
        node.setValue("program");
    }

    @Override
    public void exitAssign(qweParser.AssignContext ctx) {
        Node node1 = new Node();
        node1.setValue("assign");

        Node node2 = new Node();
        node2.setValue("variable");

        Node node3 = new Node();
        node3.setValue(ctx.ID(0).getText());

        Node node4 = new Node();
        Node node5 = new Node();
        if (ctx.ID().size() > 1){
            node4.setValue("variable");
            node5.setValue(ctx.ID(1).getText());
        } else {
            node4.setValue("value");
            String numbers = "";
            for (TerminalNode tokenNode : ctx.NUMBER()){
                numbers += tokenNode.getText() + " ";
            }
            node5.setValue(numbers);
        }

        node4.addChildren(node5);
        node2.addChildren(node3);
        node1.addChildren(node2);
        node1.addChildren(node4);
        node.addChildren(node1);
    }


    @Override
    public void exitAdd(qweParser.AddContext ctx) {
        Node node1 = new Node();
        node1.setValue("add");

        Node node2 = new Node();
        Node node3 = new Node();

        Node node4 = new Node();
        Node node5 = new Node();

        if (ctx.ID().size() > 1){
            node2.setValue("variable");
            node3.setValue(ctx.ID(0).getText());

            node4.setValue("variable");
            node5.setValue(ctx.ID(1).getText());
        } else if (ctx.NUMBER().size() > 1){
            String numbers = "";
            for (TerminalNode tokenNode : ctx.NUMBER()){
                numbers += tokenNode.getText() + " ";
            }
            node2.setValue("value");
            node3.setValue(numbers);

            node4.setValue("variable");
            node5.setValue(ctx.ID(0).getText());
        } else {
            node2.setValue("value");
            node3.setValue(ctx.NUMBER(0).getText());

            node4.setValue("variable");
            node5.setValue(ctx.ID(0).getText());
        }



        node4.addChildren(node5);
        node2.addChildren(node3);
        node1.addChildren(node2);
        node1.addChildren(node4);
        node.addChildren(node1);
    }

    @Override
    public void exitPrint(qweParser.PrintContext ctx) {
        Node node1 = new Node();
        node1.setValue("print");

        Node node2 = new Node();
        Node node3 = new Node();

        if (ctx.NUMBER() != null) {
            node2.setValue("value");
            node3.setValue(ctx.NUMBER().getText());
        } else {
            node2.setValue("variable");
            node3.setValue(ctx.ID().getText());
        }

        node2.addChildren(node3);
        node1.addChildren(node2);

        node.addChildren(node1);
    }

    @Override
    public void enterIfg(qweParser.IfgContext ctx) {
        Node node1 = new Node();
        node1.setValue("ifg");
        node1.setParent(node);
        node.addChildren(node1);

        node = node1;
    }

    @Override
    public void exitIfg(qweParser.IfgContext ctx) {
        Node node1  = node.getParent();
        Node node2 = node1.getParent();
        node = node2;
    }

    public static void main(String[] args) {
        try {
            org.antlr.v4.runtime.CharStream input =
                    CharStreams.fromFileName("D:\\JavaProjects\\YAPIS\\src\\myCode.qwe");

            qweLexer lexer = new qweLexer(input);
            qweParser parser = new qweParser(new CommonTokenStream(lexer));
            parser.addParseListener(new MyListenerTree());
            parser.program();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

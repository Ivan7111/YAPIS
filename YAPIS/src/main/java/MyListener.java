import gen.qweBaseListener;
import gen.qweLexer;
import gen.qweParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyListener extends qweBaseListener {
    private Map<String, Integer> variables;
    private Map<String, List<Integer>> arrays;
    private Map<String, Integer> bufferVariables;
    private Map<String, List<Integer>> bufferArrays;
    private Boolean pass = true;

    public MyListener() {
        variables = new HashMap<>();
        arrays = new HashMap<>();
    }

    @Override
    public void exitAssign(qweParser.AssignContext ctx) {
        if (!pass) {
            return;
        }

        String variableName = ctx.ID(0).getText();

        if (ctx.ID().size() > 1) {
            String variableName2 = ctx.ID(1).getText();
            if (variables.containsKey(variableName2)) {
                variables.put(variableName, variables.get(variableName2));
            } else if (arrays.containsKey(variableName2)) {
                arrays.put(variableName, arrays.get(variableName2));
            }
        } else if (ctx.NUMBER().size() > 1) {
            if (ctx.NUMBER() != null) {
                List<Integer> array = new LinkedList<>();
                for (TerminalNode tokenNode : ctx.NUMBER()) {
                    array.add(Integer.parseInt(tokenNode.getText()));
                }
                arrays.put(variableName, array);
            }
        } else {
            String value = ctx.NUMBER(0).getText();
            variables.put(variableName, Integer.parseInt(value));
        }
    }

    @Override
    public void exitIfBody(qweParser.IfBodyContext ctx) {
        int first = 0;
        int second = 0;
        if (ctx.ID().size() > 1) {
            if (variables.containsKey(ctx.ID(0).getText())) {
                first = 1;
            } else if (arrays.containsKey(ctx.ID(0).getText())) {
                first = arrays.get(ctx.ID(0).getText()).size();
            }
            if (variables.containsKey(ctx.ID(1).getText())) {
                second = 1;
            } else if (arrays.containsKey(ctx.ID(1).getText())) {
                second = arrays.get(ctx.ID(1).getText()).size();
            }
        } else {
            if (variables.containsKey(ctx.ID(0).getText())) {
                first = 1;
            } else if (arrays.containsKey(ctx.ID(0).getText())) {
                first = arrays.get(ctx.ID(0).getText()).size();
            }

            second = Integer.parseInt(ctx.NUMBER().getText());
        }

        System.out.println(first + " -- " + second);
        if (ctx.MoreLess().getText().equals("<")) {
            pass = first < second;
        } else if (ctx.MoreLess().getText().equals(">")) {
            pass = first > second;
        } else if (ctx.MoreLess().getText().equals("==")) {
            pass = first == second;
        }


   }

    @Override
    public void exitBlockIf(qweParser.BlockIfContext ctx) {
        pass = !pass;
    }

    @Override
    public void exitIfg(qweParser.IfgContext ctx) {
        pass = true;
    }

    @Override
    public void exitAdd(qweParser.AddContext ctx) {
        if (!pass) {
            return;
        }


        String variableName2 = ctx.ID().size() > 1 ?
                ctx.ID(1).getText() : ctx.ID(0).getText();
        List<Integer> array = new LinkedList<>();

        if (ctx.ID().size() > 1) {
            String variableName1 = ctx.ID(0).getText();
            if (variables.containsKey(variableName1)) {
                array.add(variables.get(variableName1));
            } else if (arrays.containsKey(variableName1)) {
                array.addAll(arrays.get(variableName1));
            }
        } else if (ctx.NUMBER() != null) {
            for (TerminalNode tokenNode : ctx.NUMBER()) {
                array.add(Integer.parseInt(tokenNode.getText()));
            }
        }

        if (variables.containsKey(variableName2)) {
            arrays.put(variableName2, Collections.singletonList(variables.get(variableName2)));
            variables.remove(variableName2);
        }
        Set<Integer> set1 = new HashSet<>(array);
        Set<Integer> set2 = new HashSet<>(arrays.get(variableName2));
        Set<Integer> union = Stream.concat(set1.stream(), set2.stream()).collect(Collectors.toSet());

        List<Integer> arr2 = new ArrayList<>(union);
        arrays.put(variableName2, arr2);


    }

    @Override
    public void exitPrint(qweParser.PrintContext ctx) {
        if (!pass) {
            return;
        }

        String output = "";
        if (ctx.ID() != null) {
            if (variables.containsKey(ctx.ID().getText())) {
                output = variables.get(ctx.ID().getText()).toString();
            } else if (arrays.containsKey(ctx.ID().getText())) {
                output = arrays.get(ctx.ID().getText()).toString();
            }
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        try {
            org.antlr.v4.runtime.CharStream input =
                    CharStreams.fromFileName("D:\\JavaProjects\\YAPIS\\src\\myCode.qwe");

            qweLexer lexer = new qweLexer(input);
            qweParser parser = new qweParser(new CommonTokenStream(lexer));
            parser.addParseListener(new MyListener());
            parser.program();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

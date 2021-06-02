package View;

import MyNode.MyListenerTree;
import MyNode.Node;
import gen.qweLexer;
import gen.qweParser;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;


public class TreeV extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            org.antlr.v4.runtime.CharStream input =
                    CharStreams.fromFileName("C:\\Users\\deus\\Downloads\\YAPIS\\src\\myCode.qwe");

            qweLexer lexer = new qweLexer(input);
            qweParser parser = new qweParser(new CommonTokenStream(lexer));

            MyListenerTree myListenerTree = new MyListenerTree();
            parser.addParseListener(myListenerTree);
            parser.program();

            TreeItem<String> tree = createTree(myListenerTree.node);

            TreeView<String> langsTreeView = new TreeView<>(tree);
            Scene scene = new Scene(langsTreeView, 700, 500);
            primaryStage.setTitle("JavaFX TextArea (o7planning.org)");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public TreeItem<String> createTree(Node node) {
        if (node == null) {
            return null;
        }
        TreeItem<String> treeItem = new TreeItem<>();

        for (Node i : node.getChildren()) {
            treeItem.getChildren().add(createTree(i));
        }

        treeItem.setValue(node.getValue());
        return treeItem;
    }
}

package MyNode;

import java.util.LinkedList;
import java.util.List;

public class Node {
    private List<Node> children = new LinkedList<>();
    private String value;
    private Node parent;

    public List<Node> getChildren() {
        return children;
    }

    public void addChildren(Node children) {
        this.children.add(children);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}

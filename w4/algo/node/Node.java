package aco.w4.algo.node;

public class Node {
    public Object value;
    public Node next;

    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node() {
    }

    public Object getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }
}

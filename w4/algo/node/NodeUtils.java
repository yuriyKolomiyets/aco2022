package aco.w4.algo.node;

public class NodeUtils {

    private Node head;

    public static Node addToHead (Node newNode, Node chainHead){
        newNode.next = chainHead;
        return newNode;
    }

    public static Node addToTail (Node newNode, Node chainHead){

        if (chainHead.next == null){
            chainHead.next = newNode;
            return chainHead;
        } else {
            return addToTail(newNode,chainHead.next);
        }
    }

    public Node getHead() {
        return head;
    }

    public boolean hasNext (){
        if (head.getNext() == null){
            return false;
        }else {
            return true;
        }
    }
}

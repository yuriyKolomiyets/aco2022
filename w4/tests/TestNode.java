package aco.w4.tests;

import aco.w4.algo.node.Node;
import aco.w4.algo.node.NodeUtils;

public class TestNode {

    public static void main(String[] args) {

        Node head = new Node(1, new Node(2, new Node(3,
                new Node(4, new Node(5, null)))));
        Node test1 = new Node (10, null);
        Integer res = (Integer) NodeUtils.addToHead(test1, head).getValue();
        System.out.println(res == 10);

        Node test2 = new Node (20, null);
        Integer res2 = (Integer) NodeUtils.addToTail(test2, head).getValue();
        System.out.println(res2 == 5);

        System.out.println(NodeUtils.toString(head));

        }


}

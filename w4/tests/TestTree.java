package aco.w4.tests;

import aco.w4.algo.tree.ITreeController;
import aco.w4.algo.tree.Link;
import aco.w4.algo.tree.TreeController;

public class TestTree {

    public static void main(String[] args) throws Exception {
        Link emp1 = new Link(1, "emp1");
        Link emp2 = new Link(1, "emp2");
        Link emp3 = new Link(1, "emp3");
        Link emp4 = new Link(1, "emp4");

        Link man = new Link(2, "man", emp1,emp2,emp3,emp4);

        ITreeController treeController = new TreeController();
        Integer res = treeController.getAmount(man);

        System.out.println(res == 6);

    }
}

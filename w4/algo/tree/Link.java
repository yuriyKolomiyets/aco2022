package aco.w4.algo.tree;

import java.util.List;

public class Link {

    private Object data;
    private String desc;
    private List<Link> children;

    public Link(Object data, String desc, List<Link> children) {
        this.data = data;
        this.desc = desc;
        this.children = children;
    }
}

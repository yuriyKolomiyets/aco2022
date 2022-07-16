package aco.w4.algo.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Link {

    private Object data;
    private String desc;
    private List<Link> children;

    public Link(Object data, String desc, List<Link> children) {
        this.data = data;
        this.desc = desc;
        this.children = new ArrayList<>();
    }

    public Link(Object data, String desc, Link...children) {
        this.data = data;
        this.desc = desc;
        this.children = Arrays.asList(children);
    }

    public void addChild (Link child){
        children.add(child);
    }

    public Object getData() {
        return data;
    }

    public String getDesc() {
        return desc;
    }

    public List<Link> getChildren() {
        return children;
    }
}

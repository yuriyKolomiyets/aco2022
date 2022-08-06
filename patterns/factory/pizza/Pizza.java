package aco.patterns.factory.pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    String name;
    String dough;
    String sauce;
    List toppings = new ArrayList();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }
}

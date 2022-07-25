package aco.patterns.decorator.beverages;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 2;
    }
}

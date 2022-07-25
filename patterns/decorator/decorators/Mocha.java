package aco.patterns.decorator.decorators;

import aco.patterns.decorator.beverages.Beverage;

public class Mocha extends CondimentDecorator {

    Beverage beverage;
    String desccription = "Mocha";
    double cost = 0.9;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + desccription;
    }
}

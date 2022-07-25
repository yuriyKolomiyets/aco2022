package aco.patterns.decorator.decorators;

import aco.patterns.decorator.beverages.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;
    String desccription = "Whip";
    double cost = 1.5;

    public Whip(Beverage beverage) {
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

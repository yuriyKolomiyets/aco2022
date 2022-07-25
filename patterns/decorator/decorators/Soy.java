package aco.patterns.decorator.decorators;

import aco.patterns.decorator.beverages.Beverage;
import aco.patterns.decorator.beverages.HouseBlend;

public class Soy extends CondimentDecorator {
    Beverage beverage;
    String desccription = "Soy";
    double cost = 2;

    public Soy(Beverage beverage) {
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

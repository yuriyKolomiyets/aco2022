package aco.patterns.decorator.decorators;

import aco.patterns.decorator.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
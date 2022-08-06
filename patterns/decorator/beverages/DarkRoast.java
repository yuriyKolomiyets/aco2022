package aco.patterns.decorator.beverages;

public class DarkRoast extends Beverage{

    private double cost = 0.5;


    public DarkRoast() {
        this.description = "Darkroast";
    }


    @Override
    public double cost() {
        return cost;
    }
}

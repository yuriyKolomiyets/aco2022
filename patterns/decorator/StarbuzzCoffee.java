package aco.patterns.decorator;

import aco.patterns.decorator.beverages.Beverage;
import aco.patterns.decorator.beverages.DarkRoast;
import aco.patterns.decorator.beverages.Espresso;
import aco.patterns.decorator.beverages.HouseBlend;
import aco.patterns.decorator.decorators.Mocha;
import aco.patterns.decorator.decorators.Soy;
import aco.patterns.decorator.decorators.Whip;

public class StarbuzzCoffee {


    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + "$" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new Whip(new Mocha(new Soy(new HouseBlend())));
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}

package aco.patterns.strategy.ducks.test;

import aco.patterns.strategy.ducks.behaviours.FlyWithWings;
import aco.patterns.strategy.ducks.behaviours.Squeak;
import aco.patterns.strategy.ducks.model.Duck;
import aco.patterns.strategy.ducks.model.DuckCall;
import aco.patterns.strategy.ducks.model.MallardDuck;
import aco.patterns.strategy.ducks.model.RubberDuck;

public class TestDucks {

    public static void main(String[] args) {
        Duck duck1 = new MallardDuck(1,"Utka1");
        Duck duck2 = new RubberDuck(2,"Utka2");
        duck1.fly();
        duck1.quack();
        duck2.fly();
        duck2.quack();
        duck2.setFlyBehaviour(new FlyWithWings());
        duck2.setQuackBehaviour(new Squeak());
        duck2.fly();
        duck2.quack();

        DuckCall duckCall = new DuckCall();
        duckCall.quack();
    }
}

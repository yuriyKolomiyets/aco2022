package aco.patterns.strategy.ducks.model;

import aco.patterns.strategy.ducks.behaviours.FlyNoWay;
import aco.patterns.strategy.ducks.behaviours.MuteQuack;

public class RubberDuck extends Duck{

    public RubberDuck(int size, String name) {
        super(size, name);
        super.setFlyBehaviour(new FlyNoWay());
        super.setQuackBehaviour(new MuteQuack());
    }


}

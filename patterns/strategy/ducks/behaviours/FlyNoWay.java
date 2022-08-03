package aco.patterns.strategy.ducks.behaviours;

public class FlyNoWay implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("...");
    }
}

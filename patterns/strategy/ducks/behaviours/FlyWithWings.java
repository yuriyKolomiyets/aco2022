package aco.patterns.strategy.ducks.behaviours;

public class FlyWithWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("flight on 100 m");
    }
}

package aco.patterns.strategy.ducks.behaviours;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Quack-quack");
    }
}

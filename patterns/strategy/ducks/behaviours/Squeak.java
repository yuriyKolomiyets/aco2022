package aco.patterns.strategy.ducks.behaviours;

public class Squeak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Ruber squaek");
    }
}

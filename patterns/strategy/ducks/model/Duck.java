package aco.patterns.strategy.ducks.model;

import aco.patterns.strategy.ducks.behaviours.*;

public class Duck implements QuackBehaviour, FlyBehaviour {

    private int size;
    private String name;
    private QuackBehaviour quackBehaviour;
    private FlyBehaviour flyBehaviour;

    public Duck(int size, String name) {
        this.size = size;
        this.name = name;
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new Quack();
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        flyBehaviour.fly();
    }

    @Override
    public void quack() {
    quackBehaviour.quack();
    }
}

package aco.patterns.strategy.ducks.model;

import aco.patterns.strategy.ducks.behaviours.Quack;
import aco.patterns.strategy.ducks.behaviours.QuackBehaviour;

public class DuckCall {

    private QuackBehaviour quackBehaviour;

    public DuckCall() {
        this.quackBehaviour = new Quack();
    }
    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
    public void quack(){
        quackBehaviour.quack();
    }

}

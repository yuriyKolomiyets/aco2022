package aco.patterns.strategy.ducks.behaviours;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println(".... silence");
    }
}

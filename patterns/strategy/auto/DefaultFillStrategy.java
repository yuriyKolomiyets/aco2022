package aco.patterns.strategy.auto;

public class DefaultFillStrategy implements IFillStrategy {
    @Override
    public void fill() {
        System.out.println("I am default fill");
    }
}

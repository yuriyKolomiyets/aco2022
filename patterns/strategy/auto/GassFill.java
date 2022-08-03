package aco.patterns.strategy.auto;

public class GassFill implements IFillStrategy {
    @Override
    public void fill() {
        System.out.println("Gas station");
    }
}
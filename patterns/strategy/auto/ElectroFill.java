package aco.patterns.strategy.auto;

public class ElectroFill implements IFillStrategy{
    @Override
    public void fill() {
        System.out.println("Charging");
    }
}

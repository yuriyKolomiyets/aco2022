package aco.patterns.strategy;

public class ElectroFill implements IFillStrategy{
    @Override
    public void fill() {
        System.out.println("Charging");
    }
}

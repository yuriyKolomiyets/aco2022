package aco.w4.model;

import aco.patterns.strategy.auto.IFillStrategy;

public class Tesla extends Auto{

    private AutoKey autoKey;
    public Tesla(IFillStrategy iFillStrategy) {
        super(iFillStrategy);
    }

    public Tesla() {
    }




}

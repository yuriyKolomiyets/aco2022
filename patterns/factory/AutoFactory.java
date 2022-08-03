package aco.patterns.factory;

import aco.patterns.proxy.IAutoProxy;
import aco.patterns.proxy.AutoProxy;
import aco.w4.model.Auto;
import aco.patterns.strategy.auto.GassFill;

public class AutoFactory {

    public static IAutoProxy create () {
        return new AutoProxy(new Auto(new GassFill()));
    }
}

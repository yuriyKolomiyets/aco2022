package aco.w4.factory;

import aco.w4.proxy.IAutoProxy;
import aco.w4.proxy.AutoProxy;
import aco.w4.model.Auto;
import aco.w4.strategy.GassFill;

public class AutoFactory {

    public static IAutoProxy create () {
        return new AutoProxy(new Auto(new GassFill()));
    }
}

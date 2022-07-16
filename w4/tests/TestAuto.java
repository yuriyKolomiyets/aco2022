package aco.w4.tests;

import aco.w4.factory.AutoFactory;
import aco.w4.proxy.IAutoProxy;
import aco.w4.model.Auto;
import aco.w4.strategy.ElectroFill;
import aco.w4.strategy.GassFill;
import aco.w4.model.Tesla;

public class TestAuto {

    public static void main(String[] args) {
        Auto tesla = new Tesla(new ElectroFill());
        tesla.run();
        tesla.stop();
        tesla.fill();
        tesla.setIFillStrategy(new GassFill());
        tesla.fill();

        Auto tesla1 = new Tesla();
        tesla1.fill();
        tesla1.setIFillStrategy(new ElectroFill());
        tesla1.fill();

        IAutoProxy tesla12 = AutoFactory.create();
        System.out.println("tesla12");
        tesla12.run();
        tesla12.fill();





    }
}

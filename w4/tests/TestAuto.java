package aco.w4.tests;

import aco.w4.factory.AutoFactory;
import aco.w4.model.AutoKey;
import aco.w4.proxy.IAutoProxy;
import aco.w4.model.Auto;
import aco.w4.strategy.ElectroFill;
import aco.w4.strategy.GassFill;
import aco.w4.model.Tesla;
import aco.w6.exceptions.InvalidCredentialsExceptions;

public class TestAuto {

    public static void main(String[] args) throws Exception {

        AutoKey autoKey = new AutoKey();

        Auto tesla = new Tesla(new ElectroFill());
        tesla.run(autoKey);
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
        tesla12.fill();


        autoKey.setStartKey("id 1");
       try {
           tesla12.run(autoKey);
       } catch (InvalidCredentialsExceptions exceptions){
           tesla12.stop();
           System.out.println("key invalid");
       }
    }
}

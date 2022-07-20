package aco.w4.model;

import aco.w4.fasade.AutoLights;
import aco.w4.fasade.Engine;
import aco.w4.fasade.Musicc;
import aco.w4.proxy.IAutoProxy;
import aco.w4.strategy.DefaultFillStrategy;
import aco.w4.strategy.IFillStrategy;
import aco.w6.exceptions.InvalidCredentialsExceptions;

public class Auto implements IAutoProxy {

    private IFillStrategy iFillStrategy;
    private AutoLights autoLights;
    private Engine engine;
    private Musicc musicc;

    private String startKey;

    public Auto(IFillStrategy iFillStrategy) {
        this.iFillStrategy = iFillStrategy;
        this.autoLights = new AutoLights();
        this.engine = new Engine();
        this.musicc = new Musicc();
        this.startKey = "valid key for my tesla";
    }
    public Auto() {
        this.iFillStrategy = new DefaultFillStrategy();
        this.autoLights = new AutoLights();
        this.engine = new Engine();
        this.musicc = new Musicc();
        this.startKey = "valid key for my tesla";
    }


    @Override
    public void run(AutoKey autoKey) throws Exception {

        if (!startKey.equals(autoKey.getStartKey())){
            throw new InvalidCredentialsExceptions("Your key is not valid");
        }
        autoLights.lightsOn();
        engine.starEngine();
        musicc.musicOn();
        System.out.println("GO");
    }

    public void fill (){
        iFillStrategy.fill();
    }

    @Override
    public void stop(){
        System.out.println("STOP");
    }

    public void setIFillStrategy(IFillStrategy iFillStrategy) {
        this.iFillStrategy = iFillStrategy;
    }
}

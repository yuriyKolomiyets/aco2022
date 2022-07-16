package aco.w4.model;

import aco.w4.fasade.AutoLights;
import aco.w4.fasade.Engine;
import aco.w4.fasade.Musicc;
import aco.w4.proxy.IAutoProxy;
import aco.w4.strategy.DefaultFillStrategy;
import aco.w4.strategy.IFillStrategy;

public class Auto implements IAutoProxy {

    private IFillStrategy iFillStrategy;
    private AutoLights autoLights;
    private Engine engine;
    private Musicc musicc;

    public Auto(IFillStrategy iFillStrategy) {
        this.iFillStrategy = iFillStrategy;
        this.autoLights = new AutoLights();
        this.engine = new Engine();
        this.musicc = new Musicc();
    }
    public Auto() {
        this.iFillStrategy = new DefaultFillStrategy();
        this.autoLights = new AutoLights();
        this.engine = new Engine();
        this.musicc = new Musicc();
    }
    public void fill (){
        iFillStrategy.fill();
    }
    public void run() {
        autoLights.lightsOn();
        engine.starEngine();
        musicc.musicOn();
        System.out.println("GO");
    }

    public void stop(){
        System.out.println("STOP");
    }

    public void setIFillStrategy(IFillStrategy iFillStrategy) {
        this.iFillStrategy = iFillStrategy;
    }
}

package aco.patterns.observer.builtInObservver;

import aco.patterns.observer.ownObserver.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay1 implements Observer, DisplayElement {

    Observable observable;
    private int temp;
    private int humidity;

    public CurrentConditionsDisplay1(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {

        System.out.println("Current conditions: " + temp + "degrees " + humidity + "humidity." );
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData1) {
            WeatherData1 wd = (WeatherData1)o;
            this.temp = wd.getTemp();
            this.humidity = wd.getHumidity();
            display();
        }
    }
}

package aco.patterns.observer.builtInObservver;

import java.util.Observable;

public class WeatherData1 extends Observable {

    private int temp;
    private int humidity;
    private int pressure;

    public WeatherData1() {
    }

    public int getTemp() {
        return temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(int temperature, int humidity, int pressure) {
        this.temp = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


}

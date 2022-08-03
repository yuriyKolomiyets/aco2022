package aco.patterns.observer.ownObserver;

import java.util.ArrayList;

public class WeatherData implements Subject {

   private int temp;
   private int humidity;
   private int pressure;
   private ArrayList <Observer> observers;

   public WeatherData(int temp, int humidity, int pressure) {
       observers = new ArrayList();
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i); }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temp, humidity, pressure);
        }
    }

    public void setMeasurements(int temperature, int humidity, int pressure) {
       this.temp = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
   }


    void measurementsChanged(){
        notifyObservers();
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


}

package aco.patterns.observer.ownObserver;

public class StatisticsDisplay implements Observer, DisplayElement {
    private int temp;
    private int humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp + "degrees " + humidity + "humidity." );
    }

    @Override
    public void update(int temp, int humidity, int pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}

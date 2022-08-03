package aco.patterns.observer.ownObserver;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(wd);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(wd);
        wd.setMeasurements(80, 65, 30);
        wd.setMeasurements(82, 70, 29);
        wd.setMeasurements(78, 90, 20);
    }
}

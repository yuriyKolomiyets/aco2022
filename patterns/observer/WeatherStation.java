package aco.patterns.observer;

import aco.patterns.observer.builtInObservver.CurrentConditionsDisplay1;
import aco.patterns.observer.builtInObservver.WeatherData1;
import aco.patterns.observer.ownObserver.CurrentConditionsDisplay;
import aco.patterns.observer.ownObserver.StatisticsDisplay;
import aco.patterns.observer.ownObserver.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(wd);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(wd);
        wd.setMeasurements(80, 65, 30);
        wd.setMeasurements(82, 70, 29);
        wd.setMeasurements(78, 90, 20);

        System.out.println("---");

        WeatherData1 wd1 = new WeatherData1();
        CurrentConditionsDisplay1 currentDisplay1 =
                new CurrentConditionsDisplay1(wd1);
        wd1.setMeasurements(80, 65, 30);

    }
}

package ObserverPatternAPI;

import ObserverPatternAPI.impl.CurrentConditionsDisplay;
import ObserverPatternAPI.impl.StatisticsDisplay;
import ObserverPatternAPI.impl.WeatherData;

public class ObserverMain2 {

    public static void main(String[] args){

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay=
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(20,30,40);
        weatherData.setMeasurements(30,40,50);

    }

}

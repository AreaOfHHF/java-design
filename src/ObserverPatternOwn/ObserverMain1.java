package ObserverPatternOwn;

import ObserverPatternOwn.impl.CurrentConditionsDisplay;
import ObserverPatternOwn.impl.ForecastDisplay;
import ObserverPatternOwn.impl.StatisticsDisplay;
import ObserverPatternOwn.impl.WeatherData;

public class ObserverMain1 {

    public static void main(String[] args){

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay =
                new ForecastDisplay(weatherData);
        weatherData.setMeasurements(20,30,40);
        weatherData.setMeasurements(30,40,50);

    }

}

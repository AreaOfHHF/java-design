package ObserverPatternOwn.impl;

import ObserverPatternOwn.inter.DisplayElement;
import ObserverPatternOwn.inter.Observer;
import ObserverPatternOwn.inter.Subject;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temp+","+humidity+","+pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}

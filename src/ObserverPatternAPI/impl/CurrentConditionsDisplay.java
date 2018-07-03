package ObserverPatternAPI.impl;

import ObserverPatternOwn.inter.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement{

    private Observable observable;
    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temp+","+humidity+","+pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
//            Object[] objects = (Object[]) arg;
//            System.out.println(objects[0]+","+objects[1]+","+objects[2]);
            display();
        }
    }
}

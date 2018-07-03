package ObserverPatternAPI.impl;

import ObserverPatternAPI.inter.DisplayElement;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer,DisplayElement{

    private Observable observable;
    private float temp;
    private ArrayList temps;

    public StatisticsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
        temps = new ArrayList();
    }

    @Override
    public void display() {
        float tempSum = 0;
        temps.add(temp);
        for(int i = 0;i<temps.size();i++){
            tempSum = tempSum + (float)temps.get(i);
        }
        float tempMean = tempSum/temps.size();
        System.out.println("Statistics conditions: "+tempMean);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            display();
        }
    }
}

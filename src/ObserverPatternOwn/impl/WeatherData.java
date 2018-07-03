package ObserverPatternOwn.impl;

import ObserverPatternOwn.inter.Observer;
import ObserverPatternOwn.inter.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject{

    private ArrayList<Observer> observerArrayList;

    private float temp;

    private float humidity;

    private float pressure;

    public WeatherData(){

        observerArrayList = new ArrayList<Observer>();

    }

    @Override
    public void registerObserver(Observer observer) {
        observerArrayList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observerArrayList.indexOf(observer);
        observerArrayList.remove(index);
    }

    @Override
    public void notifyObservers() {
        for(int i = 0;i<observerArrayList.size();i++){
            Observer observer = observerArrayList.get(i);
            observer.update(temp,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temp,float humidity,float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}

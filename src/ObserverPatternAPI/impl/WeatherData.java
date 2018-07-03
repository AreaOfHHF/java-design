package ObserverPatternAPI.impl;

import java.util.Observable;

public class WeatherData extends Observable{

    public WeatherData(){}

    private float temp;
    private float humidity;
    private float pressure;

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setMeasurements(float temp,float humidity,float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public void measurementChanged(){
        setChanged();
        /**
         * 推的方式
         */
//        notifyObservers(new Object[]{temp*2,humidity*2,pressure*2});
        /**
         * 拉的方式
         */
        notifyObservers();
    }

}

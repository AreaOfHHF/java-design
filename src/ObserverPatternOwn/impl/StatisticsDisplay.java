package ObserverPatternOwn.impl;

import ObserverPatternOwn.inter.DisplayElement;
import ObserverPatternOwn.inter.Observer;
import ObserverPatternOwn.inter.Subject;

import java.util.ArrayList;

public class StatisticsDisplay implements Observer,DisplayElement{

    private ArrayList temps;
    private ArrayList humiditys;
    private ArrayList pressures;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        temps = new ArrayList();
        humiditys = new ArrayList();
        pressures = new ArrayList();
    }

    @Override
    public void display() {
        float tempSum = 0;
        float humiditySum = 0;
        float pressureSum = 0;
        for(int i = 0;i<temps.size();i++){
            float tempTemp = (float) temps.get(i);
            float humidityTemp = (float) humiditys.get(i);
            float pressureTemp = (float) pressures.get(i);
            tempSum = tempSum + tempTemp;
            humiditySum = humiditySum + humidityTemp;
            pressureSum = pressureSum + pressureTemp;
        }
        float tempMean = tempSum/temps.size();
        float humidityMean = humiditySum/humiditys.size();
        float pressureMean = pressureSum/pressures.size();
        System.out.println("Statistics conditions: "+tempMean+","+humidityMean+","+pressureMean);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        temps.add(temp);
        humiditys.add(humidity);
        pressures.add(pressure);
        display();
    }
}

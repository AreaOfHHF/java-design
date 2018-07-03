package ComplexPattern_Observer.impl;

import ComplexPattern_Observer.inter.Observer;
import ComplexPattern_Observer.inter.Quackable;

//鸭鸣器
public class DuckCall implements Quackable{

    private Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak!");
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        observable.notifyObserver();
    }
}

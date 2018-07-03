package ComplexPattern_Observer.impl;

import ComplexPattern_Observer.inter.Observer;
import ComplexPattern_Observer.inter.QuackObservable;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable{

    ArrayList<Observer> observers = new ArrayList<Observer>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        Iterator iterator = observers.iterator();
        while(iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}

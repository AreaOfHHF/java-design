package ComplexPattern_Observer.impl;

import ComplexPattern_Observer.inter.Observer;
import ComplexPattern_Observer.inter.Quackable;

public class MallardDuck implements Quackable{

    private Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack!");
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

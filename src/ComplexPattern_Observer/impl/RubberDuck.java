package ComplexPattern_Observer.impl;

import ComplexPattern_Observer.inter.Observer;
import ComplexPattern_Observer.inter.Quackable;

public class RubberDuck implements Quackable{

    private Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak!");
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

package ComplexPattern_Observer.impl;

import ComplexPattern_Observer.inter.Observer;
import ComplexPattern_Observer.inter.Quackable;

public class QuackCount implements Quackable{
    private Quackable quackable;
    public static int count = 0;

    public QuackCount(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        ++count;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void registerObserver(Observer observer) {
        quackable.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        quackable.notifyObserver();
    }
}

package ComplexPattern_Observer.impl;

import ComplexPattern_Observer.inter.Observer;
import ComplexPattern_Observer.inter.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{

    private ArrayList<Quackable> quackables = new ArrayList<Quackable>();

    public void add(Quackable quackable){
        quackables.add(quackable);
    }

    @Override
    public void quack() {
        Iterator iterator = quackables.iterator();
        while(iterator.hasNext()){
            Quackable quackable = (Quackable) iterator.next();
            quackable.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = quackables.iterator();
        while(iterator.hasNext()){
            Quackable duck = (Quackable) iterator.next();
            duck.registerObserver(observer);
        }
    }

    //每个Quackable都负责自己通知观察者，这样Flock就不用担心了。
    @Override
    public void notifyObserver() {

    }
}

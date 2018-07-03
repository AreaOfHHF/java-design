package ComplexPattern_Combine.impl;

import ComplexPattern_Combine.inter.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{

    private ArrayList<Quackable> quacks = new ArrayList<Quackable>();

    public void add(Quackable quackable){
        quacks.add(quackable);
    }

    @Override
    public void quack() {
        Iterator iterator = quacks.iterator();
        while(iterator.hasNext()){
            Quackable quackable = (Quackable) iterator.next();
            quackable.quack();
        }
    }
}

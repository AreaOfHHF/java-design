package ComplexPattern_Factory.impl;

import ComplexPattern_Factory.inter.Quackable;

public class RedHeadDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}

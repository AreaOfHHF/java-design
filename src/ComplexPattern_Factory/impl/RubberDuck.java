package ComplexPattern_Factory.impl;

import ComplexPattern_Factory.inter.Quackable;

public class RubberDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}

package ComplexPattern_Decorator.impl;

import ComplexPattern_Decorator.inter.Quackable;

public class MallardDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}

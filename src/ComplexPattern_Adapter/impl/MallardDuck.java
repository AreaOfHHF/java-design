package ComplexPattern_Adapter.impl;

import ComplexPattern_Adapter.inter.Quackable;

public class MallardDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}

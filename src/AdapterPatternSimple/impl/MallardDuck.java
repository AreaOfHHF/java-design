package AdapterPatternSimple.impl;

import AdapterPatternSimple.inter.Duck;

public class MallardDuck implements Duck{

    public MallardDuck() {
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}

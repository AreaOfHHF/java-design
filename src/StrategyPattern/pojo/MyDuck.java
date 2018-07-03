package StrategyPattern.pojo;

import StrategyPattern.impl.FlyWithWings;
import StrategyPattern.impl.Quack;

public class MyDuck extends Duck{

    public MyDuck(){

        flyBehavior = new FlyWithWings();

        quackBehavior = new Quack();

    }

    @Override
    public void display() {
        System.out.println("I am a real duck");
    }

}

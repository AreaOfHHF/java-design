package StrategyPattern.impl;

import StrategyPattern.inter.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can not fly!");
    }

}

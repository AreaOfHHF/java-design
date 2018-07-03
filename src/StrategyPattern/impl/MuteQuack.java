package StrategyPattern.impl;

import StrategyPattern.inter.QuackBehavior;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Silence!");
    }

}

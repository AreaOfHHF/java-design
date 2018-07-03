package StrategyPattern.impl;

import StrategyPattern.inter.QuackBehavior;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack!");
    }

}

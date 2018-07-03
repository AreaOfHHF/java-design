package StrategyPattern;

import StrategyPattern.pojo.Duck;
import StrategyPattern.pojo.MyDuck;

public class StrategyMain1 {

    public static void main(String[] args){

        Duck duck = new MyDuck();

        duck.display();

        duck.performFly();

        duck.performQuack();

    }

}

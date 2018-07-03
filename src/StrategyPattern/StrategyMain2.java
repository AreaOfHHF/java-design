package StrategyPattern;

import StrategyPattern.impl.FlyRocketPowered;
import StrategyPattern.pojo.Duck;
import StrategyPattern.pojo.ModelDuck;

public class StrategyMain2 {

    public static void main(String[] args){

        Duck duck = new ModelDuck();

        duck.display();

        duck.performFly();

        //动态设定飞行
        duck.setFlyBehavior(new FlyRocketPowered());

        duck.performFly();

        duck.performQuack();

    }

}

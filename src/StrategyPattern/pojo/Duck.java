package StrategyPattern.pojo;

import StrategyPattern.inter.FlyBehavior;
import StrategyPattern.inter.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    /**
     *set方法动态设定行为
     */

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public Duck(){

    }

    public abstract void display();

    public void swim(){

        System.out.println("All ducks float,even decoys!");

    }

    public void performFly(){

        flyBehavior.fly();

    }

    public void performQuack(){

        quackBehavior.quack();

    }

}

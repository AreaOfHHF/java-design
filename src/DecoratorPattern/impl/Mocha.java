package DecoratorPattern.impl;

import DecoratorPattern.inter.Beverage;
import DecoratorPattern.inter.CondimentDecorator;

public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.34;
    }
}

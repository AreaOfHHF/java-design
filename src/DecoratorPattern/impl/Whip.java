package DecoratorPattern.impl;

import DecoratorPattern.inter.Beverage;
import DecoratorPattern.inter.CondimentDecorator;

public class Whip extends CondimentDecorator{

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Whip";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.5;
    }
}

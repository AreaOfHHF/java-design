package DecoratorPattern.impl;

import DecoratorPattern.inter.Beverage;
import DecoratorPattern.inter.CondimentDecorator;

public class Soy extends CondimentDecorator{

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Soy";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.4;
    }
}

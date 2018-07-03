package DecoratorPattern.impl;

import DecoratorPattern.inter.Beverage;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 2.2;
    }
}

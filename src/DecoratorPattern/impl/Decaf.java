package DecoratorPattern.impl;

import DecoratorPattern.inter.Beverage;

public class Decaf extends Beverage{

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 3.3;
    }
}

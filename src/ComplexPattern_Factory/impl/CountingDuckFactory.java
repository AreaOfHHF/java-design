package ComplexPattern_Factory.impl;

import ComplexPattern_Factory.factory.AbstractDuckFactory;
import ComplexPattern_Factory.inter.Quackable;

public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createDuckCall() {
        return new QuackCount(new DuckCall());
    }

    @Override
    public Quackable createMallardDuck() {
        return new QuackCount(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCount(new RedHeadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCount(new RubberDuck());
    }
}

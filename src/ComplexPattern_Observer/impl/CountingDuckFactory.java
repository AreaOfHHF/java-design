package ComplexPattern_Observer.impl;

import ComplexPattern_Observer.factory.AbstractDuckFactory;
import ComplexPattern_Observer.inter.Quackable;

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
        return new QuackCount(new ReadHeadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCount(new RubberDuck());
    }
}

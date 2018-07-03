package ComplexPattern_Observer.impl;

import ComplexPattern_Observer.factory.AbstractDuckFactory;
import ComplexPattern_Observer.inter.Quackable;

public class DuckFactoryImpl extends AbstractDuckFactory{
    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new ReadHeadDuck();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}

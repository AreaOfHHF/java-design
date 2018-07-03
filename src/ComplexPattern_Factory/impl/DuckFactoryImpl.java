package ComplexPattern_Factory.impl;

import ComplexPattern_Factory.factory.AbstractDuckFactory;
import ComplexPattern_Factory.inter.Quackable;

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
        return new RedHeadDuck();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}

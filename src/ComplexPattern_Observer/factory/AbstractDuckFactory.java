package ComplexPattern_Observer.factory;

import ComplexPattern_Observer.inter.Quackable;

public abstract class AbstractDuckFactory {
    public abstract Quackable createDuckCall();
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createRubberDuck();
}

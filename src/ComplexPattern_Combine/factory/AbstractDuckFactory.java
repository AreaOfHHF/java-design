package ComplexPattern_Combine.factory;

import ComplexPattern_Combine.inter.Quackable;

public abstract class AbstractDuckFactory {
    public abstract Quackable createDuckCall();
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createRubberDuck();
}

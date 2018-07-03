package ComplexPattern_Factory.factory;

import ComplexPattern_Factory.inter.Quackable;

//抽象工厂
public abstract class AbstractDuckFactory {
    public abstract Quackable createDuckCall();
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createRubberDuck();
}

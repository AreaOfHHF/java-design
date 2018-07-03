package ComplexPattern_Decorator.impl;

import ComplexPattern_Decorator.inter.Quackable;

public class QuackCount implements Quackable{

    private Quackable duck;
    public static int count = 0;

    public QuackCount(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        ++count;
    }

    public static int getCount() {
        return count;
    }
}

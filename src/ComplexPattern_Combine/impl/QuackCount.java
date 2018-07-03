package ComplexPattern_Combine.impl;

import ComplexPattern_Combine.inter.Quackable;

public class QuackCount implements Quackable{

    private Quackable quackable;
    public static int  count = 0;

    public QuackCount(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        ++count;
    }

    public static int getCount() {
        return count;
    }
}

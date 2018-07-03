package ComplexPattern_Previous.impl;

import ComplexPattern_Previous.inter.Quackable;

//鸭鸣器
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak!");
    }
}

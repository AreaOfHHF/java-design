package ComplexPattern_Factory.impl;

import ComplexPattern_Factory.inter.Quackable;

//鸭鸣器
public class DuckCall implements Quackable{
    @Override
    public void quack() {
        System.out.println("Kwak!");
    }
}

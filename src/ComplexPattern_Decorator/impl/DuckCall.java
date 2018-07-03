package ComplexPattern_Decorator.impl;

import ComplexPattern_Decorator.inter.Quackable;

//鸭鸣器
public class DuckCall implements Quackable{
    @Override
    public void quack() {
        System.out.println("Kwak!");
    }
}

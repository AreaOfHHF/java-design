package ComplexPattern_Adapter.impl;

import ComplexPattern_Adapter.inter.Quackable;

//鸭鸣器
public class DuckCall implements Quackable{
    @Override
    public void quack() {
        System.out.println("Kwak!");
    }
}

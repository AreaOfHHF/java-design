package ComplexPattern_Combine.impl;

import ComplexPattern_Combine.inter.Quackable;

public class DuckCall implements Quackable{
    @Override
    public void quack() {
        System.out.println("Kwak!");
    }
}

package ComplexPattern_Adapter.impl;

import ComplexPattern_Adapter.inter.Quackable;

//橡皮鸭
public class RubberDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}

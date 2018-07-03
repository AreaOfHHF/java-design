package ComplexPattern_Previous.impl;

import ComplexPattern_Previous.inter.Quackable;

//橡皮鸭
public class RubberDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}

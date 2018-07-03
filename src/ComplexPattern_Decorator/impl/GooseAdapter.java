package ComplexPattern_Decorator.impl;

import ComplexPattern_Decorator.inter.Quackable;
import ComplexPattern_Decorator.pojo.Goose;

public class GooseAdapter implements Quackable{

    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}

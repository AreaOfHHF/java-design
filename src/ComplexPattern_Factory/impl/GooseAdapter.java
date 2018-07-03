package ComplexPattern_Factory.impl;

import ComplexPattern_Factory.inter.Quackable;
import ComplexPattern_Factory.pojo.Goose;

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

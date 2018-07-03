package ComplexPattern_Combine.impl;

import ComplexPattern_Combine.inter.Quackable;
import ComplexPattern_Combine.pojo.Goose;

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

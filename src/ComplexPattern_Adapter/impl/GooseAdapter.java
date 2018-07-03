package ComplexPattern_Adapter.impl;

import ComplexPattern_Adapter.inter.Quackable;
import ComplexPattern_Adapter.pojo.Goose;

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

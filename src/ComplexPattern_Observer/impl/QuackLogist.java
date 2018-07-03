package ComplexPattern_Observer.impl;

import ComplexPattern_Observer.inter.Observer;
import ComplexPattern_Observer.inter.QuackObservable;

public class QuackLogist implements Observer{

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quacklogist: "+ duck +" just quacked!");
    }
}

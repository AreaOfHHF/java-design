package ComplexPattern_Previous;

import ComplexPattern_Previous.impl.DuckCall;
import ComplexPattern_Previous.impl.MallardDuck;
import ComplexPattern_Previous.impl.RedHeadDuck;
import ComplexPattern_Previous.impl.RubberDuck;
import ComplexPattern_Previous.inter.Quackable;

public class DuckSimulator {

    public static void main(String[] args){
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
    }

    public void simulate(){
        Quackable mallardDuck = new MallardDuck();
        Quackable duckCall = new DuckCall();
        Quackable redHeadDuck = new RedHeadDuck();
        Quackable rubberDuck = new RubberDuck();
        //方法重载
        simulate(mallardDuck);
        simulate(duckCall);
        simulate(redHeadDuck);
        simulate(rubberDuck);
    }

    private void simulate(Quackable quackable){
        //多态
        quackable.quack();
    }

}

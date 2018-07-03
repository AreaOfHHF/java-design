package ComplexPattern_Adapter;

import ComplexPattern_Adapter.impl.*;
import ComplexPattern_Adapter.inter.Quackable;
import ComplexPattern_Adapter.pojo.Goose;

public class DucksSimulator {
    public static void main(String[] args){
        DucksSimulator duckSimulator = new DucksSimulator();
        duckSimulator.simulate();
    }

    public void simulate(){
        Quackable mallardDuck = new MallardDuck();
        Quackable duckCall = new DuckCall();
        Quackable redHeadDuck = new RedHeadDuck();
        Quackable rubberDuck = new RubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        //方法重载
        simulate(mallardDuck);
        simulate(duckCall);
        simulate(redHeadDuck);
        simulate(rubberDuck);
        simulate(gooseDuck);
    }

    private void simulate(Quackable quackable){
        //多态
        quackable.quack();
    }
}

package ComplexPattern_Decorator;

import ComplexPattern_Decorator.impl.*;
import ComplexPattern_Decorator.inter.Quackable;
import ComplexPattern_Decorator.pojo.Goose;

public class DuckssSimulator {
    public static void main(String[] args){
        DuckssSimulator duckSimulator = new DuckssSimulator();
        duckSimulator.simulate();
    }

    public void simulate(){
        Quackable mallardDuck = new QuackCount(new MallardDuck());
        Quackable duckCall = new QuackCount(new DuckCall());
        Quackable redHeadDuck = new QuackCount(new RedHeadDuck());
        Quackable rubberDuck = new QuackCount(new RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());
        //方法重载
        simulate(mallardDuck);
        simulate(duckCall);
        simulate(redHeadDuck);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println(QuackCount.getCount());
    }

    private void simulate(Quackable quackable){
        //多态
        quackable.quack();
    }
}

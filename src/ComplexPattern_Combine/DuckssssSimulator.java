package ComplexPattern_Combine;

import ComplexPattern_Combine.factory.AbstractDuckFactory;
import ComplexPattern_Combine.impl.DuckFactoryImpl;
import ComplexPattern_Combine.impl.Flock;
import ComplexPattern_Combine.impl.GooseAdapter;
import ComplexPattern_Combine.impl.QuackCount;
import ComplexPattern_Combine.inter.Quackable;
import ComplexPattern_Combine.pojo.Goose;

public class DuckssssSimulator {
    public static void main(String[] args){
        DuckssssSimulator duckssssSimulator =
                new DuckssssSimulator();
        AbstractDuckFactory duckFactory =
                new DuckFactoryImpl();
        duckssssSimulator.simulate(duckFactory);
    }
    private void simulate(AbstractDuckFactory abstractDuckFactory){
        Quackable duckCall = abstractDuckFactory.createDuckCall();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable redHeadDuck = abstractDuckFactory.createRedHeadDuck();
        Quackable rubberDuck = abstractDuckFactory.createRubberDuck();

        Flock flockFull = new Flock();
        flockFull.add(duckCall);
        flockFull.add(gooseDuck);
        flockFull.add(redHeadDuck);
        flockFull.add(rubberDuck);

        Quackable mallardDuck1 = abstractDuckFactory.createMallardDuck();
        Quackable mallardDuck2 = abstractDuckFactory.createMallardDuck();
        Quackable mallardDuck3 = abstractDuckFactory.createMallardDuck();
        Quackable mallardDuck4 = abstractDuckFactory.createMallardDuck();

        Flock flockMallardDuck = new Flock();
        flockMallardDuck.add(mallardDuck1);
        flockMallardDuck.add(mallardDuck2);
        flockMallardDuck.add(mallardDuck3);
        flockMallardDuck.add(mallardDuck4);

        flockFull.add(flockMallardDuck);

        simulate(flockFull);
        System.out.println("*****************************");
        simulate(flockMallardDuck);

    }

    private void simulate(Quackable quackable){
        quackable.quack();
    }
}

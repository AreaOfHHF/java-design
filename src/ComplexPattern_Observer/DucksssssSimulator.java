package ComplexPattern_Observer;

import ComplexPattern_Observer.factory.AbstractDuckFactory;
import ComplexPattern_Observer.impl.CountingDuckFactory;
import ComplexPattern_Observer.impl.Flock;
import ComplexPattern_Observer.impl.GooseAdapter;
import ComplexPattern_Observer.impl.QuackLogist;
import ComplexPattern_Observer.inter.Quackable;
import ComplexPattern_Observer.pojo.Goose;

public class DucksssssSimulator {
    public static void main(String[] args){
        DucksssssSimulator ducksssssSimulator =
                new DucksssssSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        ducksssssSimulator.simulate(duckFactory);
    }
    public void simulate(AbstractDuckFactory abstractDuckFactory){
        Quackable redheadDuck = abstractDuckFactory.createRedHeadDuck();
        Quackable duckCall = abstractDuckFactory.createDuckCall();
        Quackable rubberDuck = abstractDuckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = abstractDuckFactory.createMallardDuck();
        Quackable mallardTwo = abstractDuckFactory.createMallardDuck();
        Quackable mallardThree = abstractDuckFactory.createMallardDuck();
        Quackable mallardFour = abstractDuckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfDucks.add(mallardTwo);
        flockOfDucks.add(mallardThree);
        flockOfDucks.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        QuackLogist quackLogist = new QuackLogist();
        flockOfDucks.registerObserver(quackLogist);
        simulate(flockOfDucks);
    }

    private void simulate(Flock flock){
        flock.quack();
    }
}

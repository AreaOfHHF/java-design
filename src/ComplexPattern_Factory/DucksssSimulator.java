package ComplexPattern_Factory;

import ComplexPattern_Factory.factory.AbstractDuckFactory;
import ComplexPattern_Factory.impl.CountingDuckFactory;
import ComplexPattern_Factory.impl.GooseAdapter;
import ComplexPattern_Factory.impl.QuackCount;
import ComplexPattern_Factory.inter.Quackable;
import ComplexPattern_Factory.pojo.Goose;

public class DucksssSimulator {

    public static void main(String[] args){
        AbstractDuckFactory countingDuckFactory =
                new CountingDuckFactory();
        DucksssSimulator ducksssSimulator =
                new DucksssSimulator();
        ducksssSimulator.simulate(countingDuckFactory);
    }

    private void simulate(AbstractDuckFactory abstractDuckFactory){
        Quackable duckCall = abstractDuckFactory.createDuckCall();
        Quackable mallardDuck = abstractDuckFactory.createMallardDuck();
        Quackable redHeadDuck = abstractDuckFactory.createRedHeadDuck();
        Quackable rubberDuck = abstractDuckFactory.createRubberDuck();
        Quackable gooseDuck =new GooseAdapter(new Goose());
        simulate(duckCall);
        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println(QuackCount.getCount());
    }

    private void simulate(Quackable quackable){
        quackable.quack();
    }

}

package AdapterPatternSimple;

import AdapterPatternSimple.impl.TurkeyAdapter;
import AdapterPatternSimple.impl.WildTurkey;
import AdapterPatternSimple.inter.Duck;
import AdapterPatternSimple.inter.Turkey;

public class TurkeyAdapterTest {

    public static void main(String[] args){

        Turkey turkey = new WildTurkey();
        turkey.gobble();
        turkey.fly();
        System.out.println("*********************");
        Duck duck = new TurkeyAdapter(turkey);
        testDuck(duck);

    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }

}

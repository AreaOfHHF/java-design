package AdapterPatternSimple;

import AdapterPatternSimple.impl.DuckAdapter;
import AdapterPatternSimple.impl.MallardDuck;
import AdapterPatternSimple.inter.Duck;
import AdapterPatternSimple.inter.Turkey;

public class DuckAdapterTest {

    public static void main(String[] args){

        Duck duck = new MallardDuck();
        duck.quack();
        duck.fly();
        System.out.println("**************************");
        Turkey turkey = new DuckAdapter(duck);
        for(int i=0;i<10;i++){
            turkey.gobble();
            turkey.fly();
        }
    }

}

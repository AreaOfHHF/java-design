package FactoryPatternMethod;

import FactoryPatternMethod.impl.NYStylePizzaStore;
import FactoryPatternMethod.impl.SimplePizzaStore;
import FactoryPatternMethod.inter.Pizza;
import FactoryPatternMethod.inter.PizzaStore;

public class FactoryMain2 {

    public static void main(String[] args){

        PizzaStore simplePizzaStore = new SimplePizzaStore();
        Pizza pizza = simplePizzaStore.orderPizza("cheese");
        System.out.println("We ordered a "+pizza.getName());

        System.out.println("*******************************");

        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        Pizza pizza1 = nyStylePizzaStore.orderPizza("NYStyleClam");
        System.out.println("We ordered a "+pizza1.getName());

    }

}

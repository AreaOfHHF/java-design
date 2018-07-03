package FactoryPatternClass;

import FactoryPatternClass.factory.NYPizzaFactory;
import FactoryPatternClass.factory.SimplePizzaFactory;
import FactoryPatternClass.inter.Pizza;

public class FactoryMain1 {

    public static void main(String[] args){

        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("We ordered a "+pizza.getName());

        System.out.println("*****************************");

        NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
        PizzaStore pizzaStore1 = new PizzaStore(nyPizzaFactory);
        Pizza pizza1 = pizzaStore1.orderPizza("NYStyleCheese");
        System.out.println("We ordered a "+pizza1.getName());

    }

}

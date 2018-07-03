package FactoryPatternAbstract;

import FactoryPatternAbstract.impl.ChicagoStylePizzaStore;
import FactoryPatternAbstract.impl.NYStylePizzaStore;
import FactoryPatternAbstract.inter.Pizza;
import FactoryPatternAbstract.inter.PizzaStore;

public class FactoryMain3 {

    public static void main(String[] args){

        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        Pizza pizza = nyStylePizzaStore.orderPizza("NYStyleClam");
        System.out.println("We order " + pizza.getName());

        System.out.println("******************************");

        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        Pizza pizza1 = chicagoStylePizzaStore.orderPizza("pepperoni");
        System.out.println("We order " + pizza1.getName());

    }

}

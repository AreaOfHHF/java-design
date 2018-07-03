package FactoryPatternClass;

import FactoryPatternClass.inter.Pizza;
import FactoryPatternClass.inter.PizzaFatory;

public class PizzaStore {

    PizzaFatory pizzaFatory;

    public PizzaStore(PizzaFatory pizzaFatory) {
        this.pizzaFatory = pizzaFatory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = pizzaFatory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

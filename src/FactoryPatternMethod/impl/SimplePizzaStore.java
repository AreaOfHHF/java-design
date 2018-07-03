package FactoryPatternMethod.impl;

import FactoryPatternMethod.inter.Pizza;
import FactoryPatternMethod.inter.PizzaStore;

public class SimplePizzaStore extends PizzaStore{

    public SimplePizzaStore() {
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }
        else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }
        else if(type.equals("clam")){
            pizza = new ClamPizza();
        }
        else if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}

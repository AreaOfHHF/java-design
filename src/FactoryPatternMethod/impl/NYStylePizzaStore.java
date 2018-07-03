package FactoryPatternMethod.impl;

import FactoryPatternMethod.inter.Pizza;
import FactoryPatternMethod.inter.PizzaStore;

public class NYStylePizzaStore extends PizzaStore{

    public NYStylePizzaStore() {
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("NYStyleCheese")){
            pizza = new NYStyleCheesePizza();
        }
        else if(type.equals("NYStyleClam")){
            pizza = new NYStyleClamPizza();
        }
        else if(type.equals("NYStylePepperoni")){
            pizza = new NYStylePepperoniPizza();
        }
        else if(type.equals("NYStyleVeggie")){
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}

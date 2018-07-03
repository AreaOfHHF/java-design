package FactoryPatternAbstract.impl;

import FactoryPatternAbstract.factory.PizzaIngredientFactory;
import FactoryPatternAbstract.inter.Pizza;
import FactoryPatternAbstract.inter.PizzaStore;

public class NYStylePizzaStore extends PizzaStore{

    public NYStylePizzaStore() {
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if(type.equals("NYStyleCheese")){
            pizza = new NYStyleCheesePizza(pizzaIngredientFactory);
            pizza.setName("NYStyle Cheese Pizza!");
        }
        else if(type.equals("NYStyleClam")){
            pizza = new NYStyleClamPizza(pizzaIngredientFactory);
            pizza.setName("NYStyle Clam Pizza!");
        }
        else if(type.equals("NYStylePepperoni")){
            pizza = new NYStylePepperoniPizza(pizzaIngredientFactory);
            pizza.setName("NYStyle Pepperoni Pizza!");
        }
        else if(type.equals("NYStyleVeggie")){
            pizza = new NYStyleVeggiePizza(pizzaIngredientFactory);
            pizza.setName("NYStyle Veggie Pizza!");
        }
        return pizza;
    }
}

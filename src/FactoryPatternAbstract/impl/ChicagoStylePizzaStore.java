package FactoryPatternAbstract.impl;

import FactoryPatternAbstract.inter.Pizza;
import FactoryPatternAbstract.inter.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore{

    public ChicagoStylePizzaStore() {

    }

    @Override
    public Pizza createPizza(String type) {
        ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory =
                new ChicagoPizzaIngredientFactory();
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza(chicagoPizzaIngredientFactory);
            pizza.setName("Chicago Cheese Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(chicagoPizzaIngredientFactory);
            pizza.setName("Chicago Veggie Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(chicagoPizzaIngredientFactory);
            pizza.setName("Chicago Clam Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(chicagoPizzaIngredientFactory);
            pizza.setName("Chicago Pepperoni Pizza");
        }
        return pizza;
    }
}

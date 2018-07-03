package FactoryPatternAbstract.impl;

import FactoryPatternAbstract.factory.PizzaIngredientFactory;
import FactoryPatternAbstract.inter.Pizza;

public class NYStyleClamPizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing" + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clam = pizzaIngredientFactory.createClams();
    }
}

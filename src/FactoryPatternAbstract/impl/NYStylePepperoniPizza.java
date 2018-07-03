package FactoryPatternAbstract.impl;

import FactoryPatternAbstract.factory.PizzaIngredientFactory;
import FactoryPatternAbstract.inter.Pizza;

public class NYStylePepperoniPizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStylePepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing" + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
        pepperoni = pizzaIngredientFactory.createPepperoni();
    }
}

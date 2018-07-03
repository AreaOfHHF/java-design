package FactoryPatternAbstract.factory;

import FactoryPatternAbstract.inter.*;

/**
 * 抽象工厂
 * 里面的每个方法都是 工厂方法
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}

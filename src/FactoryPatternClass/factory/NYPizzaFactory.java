package FactoryPatternClass.factory;

import FactoryPatternClass.impl.NYStyleCheesePizza;
import FactoryPatternClass.impl.NYStyleClamPizza;
import FactoryPatternClass.impl.NYStylePepperoniPizza;
import FactoryPatternClass.impl.NYStyleVeggiePizza;
import FactoryPatternClass.inter.Pizza;
import FactoryPatternClass.inter.PizzaFatory;

public class NYPizzaFactory implements PizzaFatory{
    public NYPizzaFactory() {
    }
    public Pizza createPizza(String type){
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

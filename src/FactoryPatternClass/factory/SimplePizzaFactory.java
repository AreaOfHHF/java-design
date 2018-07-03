package FactoryPatternClass.factory;

import FactoryPatternClass.impl.CheesePizza;
import FactoryPatternClass.impl.ClamPizza;
import FactoryPatternClass.impl.PepperoniPizza;
import FactoryPatternClass.impl.VeggiePizza;
import FactoryPatternClass.inter.Pizza;
import FactoryPatternClass.inter.PizzaFatory;

public class SimplePizzaFactory implements PizzaFatory{

    public SimplePizzaFactory(){
    }

    public Pizza createPizza(String type){
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

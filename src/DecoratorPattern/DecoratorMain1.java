package DecoratorPattern;

import DecoratorPattern.impl.*;
import DecoratorPattern.inter.Beverage;

public class DecoratorMain1 {

    public static void main(String[] args){

        //不加调料的DarkRoast
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription()+" $ "+beverage.cost());

        //加了三种调料的Decaf
        Beverage beverage1 = new Decaf();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()+" $ "+beverage1.cost());

    }

}

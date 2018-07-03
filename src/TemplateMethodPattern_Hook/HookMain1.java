package TemplateMethodPattern_Hook;

import TemplateMethodPattern_Hook.impl.CoffeeWithHook;
import TemplateMethodPattern_Hook.impl.TeaWithHook;
import TemplateMethodPattern_Hook.inter.Beverage;

public class HookMain1 {

    public static void main(String[] args){

        Beverage teaWithHook = new TeaWithHook();
        Beverage coffeeWithHook = new CoffeeWithHook();

        teaWithHook.prepareRecipe();
        coffeeWithHook.prepareRecipe();

    }

}

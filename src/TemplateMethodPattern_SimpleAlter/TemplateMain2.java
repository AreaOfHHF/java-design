package TemplateMethodPattern_SimpleAlter;

import TemplateMethodPattern_SimpleAlter.impl.Coffee;
import TemplateMethodPattern_SimpleAlter.impl.Tea;
import TemplateMethodPattern_SimpleAlter.inter.Beverage;

public class TemplateMain2 {

    public static void main(String[] args){

        Beverage tea = new Tea();
        tea.prepareRecipe();
        System.out.println("************************");
        Beverage coffee = new Coffee();
        coffee.prepareRecipe();

    }

}

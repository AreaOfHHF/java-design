package TemplateMethodPattern_Simple;

import TemplateMethodPattern_Simple.pojo.Coffee;
import TemplateMethodPattern_Simple.pojo.Tea;

public class TemplateMain1 {

    public static void main(String[] args){

        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("Making tea...");
        tea.prepareRecipe();
        System.out.println("Making coffee...");
        coffee.prepareRecipe();

    }

}

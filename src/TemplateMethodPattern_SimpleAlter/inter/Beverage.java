package TemplateMethodPattern_SimpleAlter.inter;

public abstract class Beverage {

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater(){
        System.out.println("Boiling Water!");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup!");
    }

}

package TemplateMethodPattern_Hook.inter;

public abstract class Beverage {

    public void prepareRecipe(){
        boilWater();
        brew();
        pourWater();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling Water");
    }

    void pourWater(){
        System.out.println("Pouring into Water");
    }

    public boolean customerWantsCondiments(){
        return true;
    }

}

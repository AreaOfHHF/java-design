package TemplateMethodPattern_SimpleAlter.impl;

import TemplateMethodPattern_SimpleAlter.inter.Beverage;

public class Coffee extends Beverage{
    @Override
    public void brew() {
        System.out.println("Dropping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and Milk");
    }
}

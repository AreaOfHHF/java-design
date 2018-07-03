package TemplateMethodPattern_SimpleAlter.impl;

import TemplateMethodPattern_SimpleAlter.inter.Beverage;

public class Tea extends Beverage{
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}

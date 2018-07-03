package CombinePattern_IteratorMenu.impl;

import CombinePattern_IteratorMenu.inter.MenuComponent;

import java.util.Iterator;

public class MenuItem extends MenuComponent{

    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.println(getName()+','
                +getDescription()+","
                +getPrice()+",是否为素食？"
                +isVegetarian());
    }

    //返回一个空迭代器，无作用。
    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}

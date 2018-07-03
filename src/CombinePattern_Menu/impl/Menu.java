package CombinePattern_Menu.impl;

import CombinePattern_Menu.inter.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{

    ArrayList<MenuComponent> menuComponents =
            new ArrayList<MenuComponent>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    //内部迭代遍历过程
    @Override
    public void print() {
        System.out.println(getName()+','+getDescription());
        Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}

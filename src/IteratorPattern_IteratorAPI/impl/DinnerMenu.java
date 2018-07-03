package IteratorPattern_IteratorAPI.impl;

import IteratorPattern_IteratorAPI.inter.Menu;
import IteratorPattern_IteratorAPI.pojo.MenuItem;

import java.util.Iterator;

public class DinnerMenu implements Menu{

    MenuItem[] menuItems;
    int numberOfItems = 0;
    static final int MAX_ITEMS = 6;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("K&B's Pancake Breakfast","Pancake with scrambled eggs,and toast",
                true,2.99);
        addItem("Regular Pancake Breakfast","Pancake with Fried eggs,sausage",
                false,2.99);
        addItem("Blueberry Pancakes","Pancakes made with fresh blueberries",
                true,2.99);
        addItem("Waffles","Waffles,With your choice of blueberries or strawberries",
                true,2.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        if(numberOfItems > MAX_ITEMS){
            System.err.println("Sorry!");
        }
        else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }

}

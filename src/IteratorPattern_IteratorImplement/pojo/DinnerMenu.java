package IteratorPattern_IteratorImplement.pojo;

import IteratorPattern_IteratorImplement.impl.DinnerMenuIterator;
import IteratorPattern_IteratorImplement.inter.Iterator;

public class DinnerMenu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

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

    //无get方法来遍历
    public Iterator createIterator(){
        return new DinnerMenuIterator(menuItems);
    }

}

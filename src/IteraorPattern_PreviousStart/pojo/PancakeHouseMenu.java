package IteraorPattern_PreviousStart.pojo;

import java.util.ArrayList;

public class PancakeHouseMenu {

    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast","Pancake with scrambled eggs,and toast",
                true,2.99);
        addItem("Regular Pancake Breakfast","Pancake with Fried eggs,sausage",
                false,2.99);
        addItem("Blueberry Pancakes","Pancakes made with fresh blueberries",
                true,2.99);
        addItem("Waffles","Waffles,With your choice of blueberries or strawberries",
                true,2.99);
    }

    public void addItem(String name,
                        String description,
                        boolean vegetarian,
                        double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList menuItems) {
        this.menuItems = menuItems;
    }
}

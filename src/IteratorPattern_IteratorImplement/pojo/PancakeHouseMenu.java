package IteratorPattern_IteratorImplement.pojo;

import IteratorPattern_IteratorImplement.impl.PancakeHouseMenuIterator;
import IteratorPattern_IteratorImplement.inter.Iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {

    ArrayList arrayList;

    public PancakeHouseMenu() {
        arrayList = new ArrayList();
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
        arrayList.add(menuItem);
    }

    //没有get方法来遍历
    public Iterator createIterator(){
        return new PancakeHouseMenuIterator(arrayList);
    }

}

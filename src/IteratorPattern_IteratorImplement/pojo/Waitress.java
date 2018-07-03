package IteratorPattern_IteratorImplement.pojo;

import IteratorPattern_IteratorImplement.inter.Iterator;

public class Waitress {

    PancakeHouseMenu pancakeHouseMenu;
    DinnerMenu dinnerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu,
                    DinnerMenu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu(){
        Iterator iterator = pancakeHouseMenu.createIterator();
        printIterator(iterator);
        System.out.println("*********************");
        Iterator iterator1 = dinnerMenu.createIterator();
        printIterator(iterator1);
    }

    private void printIterator(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName());
        }
    }

}

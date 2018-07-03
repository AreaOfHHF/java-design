package IteratorPattern_IteratorAPI.pojo;

import IteratorPattern_IteratorAPI.inter.Menu;

import java.util.Iterator;

public class Waitress {

    Menu pancakeHouseMenu;
    Menu dinnerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu,Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();
        printIterator(pancakeIterator);
        System.out.println("********************");
        printIterator(dinnerIterator);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&");
        printIterator(cafeIterator);
    }

    private void printIterator(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName());
        }
    }

}

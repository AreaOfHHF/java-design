package IteratorPattern_IteratorAPI.pojo;

import IteratorPattern_IteratorAPI.inter.Menu;

import java.util.ArrayList;
import java.util.Iterator;

public class WaitressAlter {

    ArrayList menus;

    public WaitressAlter(ArrayList menus) {
        this.menus = menus;
    }

    //两个迭代器
    public void printMenu(){
        Iterator menuIterator = menus.iterator();
        while(menuIterator.hasNext()){
            Menu menu = (Menu) menuIterator.next();
            printIterator(menu.createIterator());
            System.out.println("**************************");
        }
    }

    private void printIterator(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName());
        }
    }
}

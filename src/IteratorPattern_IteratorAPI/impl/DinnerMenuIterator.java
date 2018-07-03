package IteratorPattern_IteratorAPI.impl;

import IteratorPattern_IteratorAPI.pojo.MenuItem;

import java.util.Calendar;
import java.util.Iterator;

public class DinnerMenuIterator implements Iterator{

    MenuItem[] menuItems;
    int position;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        Calendar calendar = Calendar.getInstance();
        position = calendar.DAY_OF_WEEK % 2;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] == null){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position += 2;
        return menuItem;
    }

    @Override
    public void remove() {
        if(position<=0){
            throw new IllegalStateException("CAN'T");
        }
        if(menuItems[position - 1]!=null){
            for(int i = position - 1;i < (menuItems.length - 1);i++){
                menuItems[i] = menuItems[i+1];
            }
        }
    }
}

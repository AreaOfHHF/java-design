package IteratorPattern_IteratorImplement.impl;

import IteratorPattern_IteratorImplement.inter.Iterator;
import IteratorPattern_IteratorImplement.pojo.MenuItem;

public class DinnerMenuIterator implements Iterator{

    MenuItem[] menuItems;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] ==null){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}

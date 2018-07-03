package IteratorPattern_IteratorImplement.impl;

import IteratorPattern_IteratorImplement.inter.Iterator;
import IteratorPattern_IteratorImplement.pojo.MenuItem;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{

    ArrayList arrayList;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        if (position >= arrayList.size() || arrayList.get(position) == null){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) arrayList.get(position);
        position++;
        return menuItem;
    }
}

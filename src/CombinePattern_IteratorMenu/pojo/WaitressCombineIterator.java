package CombinePattern_IteratorMenu.pojo;

import CombinePattern_IteratorMenu.inter.MenuComponent;

import java.util.Iterator;

public class WaitressCombineIterator {

    MenuComponent menuComponent;

    public WaitressCombineIterator(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void printVegetarianMenu(){
        Iterator iterator = menuComponent.createIterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent1 = (MenuComponent) iterator.next();
            try{
                if(menuComponent1.isVegetarian()){
                    menuComponent1.print();
                }
                //前面MenuComponent中throw new UnsipportOperationException()
            }catch (UnsupportedOperationException e){}
        }
    }
}

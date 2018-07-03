package CombinePattern_IteratorMenu.impl;

import CombinePattern_IteratorMenu.inter.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator{

    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }
        else{
            Iterator top = (Iterator) stack.peek();
            if(!top.hasNext()){
                stack.pop();
                return hasNext();
            }
            else{
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator first = (Iterator) stack.peek();
            MenuComponent menuComponent = (MenuComponent) first.next();
            if(menuComponent instanceof Menu){
                stack.push(menuComponent.createIterator());
            }
            return menuComponent;
        }
        else{
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

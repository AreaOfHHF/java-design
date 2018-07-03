package CombinePattern_Menu.pojo;

import CombinePattern_Menu.inter.MenuComponent;

public class WaitressCombine {

    private MenuComponent allMenus;

    public WaitressCombine(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }
}

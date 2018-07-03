package IteraorPattern_PreviousStart;

import IteraorPattern_PreviousStart.pojo.DinnerMenu;
import IteraorPattern_PreviousStart.pojo.MenuItem;
import IteraorPattern_PreviousStart.pojo.PancakeHouseMenu;

import java.util.ArrayList;

public class PreviousMain {

    public static void main(String[] args){

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList arrayList = pancakeHouseMenu.getMenuItems();
        for(int i = 0;i < arrayList.size();i++){
            MenuItem menuItem = (MenuItem) arrayList.get(i);
            System.out.println(menuItem.getName());
        }

        System.out.println("**********************************");

//        DinnerMenu dinnerMenu = new DinnerMenu();
//        MenuItem[] menuItems = dinnerMenu.getMenuItems();
//        for(int i = 0;i<menuItems.length;i++){
//            MenuItem menuItemTemp = menuItems[i];
//            System.out.println(menuItemTemp.getName());
//        }

    }

}

package IteratorPattern_IteratorAPI;

import IteratorPattern_IteratorAPI.impl.CafeMenu;
import IteratorPattern_IteratorAPI.impl.DinnerMenu;
import IteratorPattern_IteratorAPI.impl.PancakeHouseMenu;
import IteratorPattern_IteratorAPI.pojo.Waitress;


public class WaitressMain {

    public static void main(String[] args){

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu,dinnerMenu,cafeMenu);
        waitress.printMenu();

    }

}

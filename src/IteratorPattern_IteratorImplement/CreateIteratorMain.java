package IteratorPattern_IteratorImplement;

import IteratorPattern_IteratorImplement.pojo.DinnerMenu;
import IteratorPattern_IteratorImplement.pojo.PancakeHouseMenu;
import IteratorPattern_IteratorImplement.pojo.Waitress;

public class CreateIteratorMain {

    public static void main(String[] args){

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu,dinnerMenu);
        waitress.printMenu();

    }

}

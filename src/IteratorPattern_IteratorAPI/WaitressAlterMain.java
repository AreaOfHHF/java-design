package IteratorPattern_IteratorAPI;

import IteratorPattern_IteratorAPI.impl.CafeMenu;
import IteratorPattern_IteratorAPI.impl.DinnerMenu;
import IteratorPattern_IteratorAPI.impl.PancakeHouseMenu;
import IteratorPattern_IteratorAPI.pojo.WaitressAlter;

import java.util.ArrayList;

public class WaitressAlterMain {

    public static void main(String[] args){

        ArrayList arrayList = new ArrayList();
        arrayList.add(new PancakeHouseMenu());
        arrayList.add(new DinnerMenu());
        arrayList.add(new CafeMenu());
        WaitressAlter waitressAlter = new WaitressAlter(arrayList);
        waitressAlter.printMenu();

    }

}

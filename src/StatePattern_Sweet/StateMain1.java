package StatePattern_Sweet;

import StatePattern_Sweet.pojo.SweetMachine;

public class StateMain1 {

    public static void main(String[] args){

        SweetMachine sweetMachine = new SweetMachine(5);

        sweetMachine.insertQuarter();
        sweetMachine.turnCrank();

        System.out.println("******************************");

        sweetMachine.insertQuarter();
        sweetMachine.turnCrank();
        sweetMachine.insertQuarter();
        sweetMachine.turnCrank();

    }

}

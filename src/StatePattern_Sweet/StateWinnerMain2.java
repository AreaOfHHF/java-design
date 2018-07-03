package StatePattern_Sweet;

import StatePattern_Sweet.pojo.SweetMachine;

public class StateWinnerMain2 {

    public static void main(String[] args){

        SweetMachine sweetMachine = new SweetMachine(20);
        for(int i = 0; i< 10; i ++){
            sweetMachine.insertQuarter();
            sweetMachine.turnCrank();
        }

    }

}

package StatePattern_Sweet.impl;

import StatePattern_Sweet.inter.State;
import StatePattern_Sweet.pojo.SweetMachine;

public class SoldState implements State{

    private SweetMachine sweetMachine;

    public SoldState(SweetMachine sweetMachine) {
        this.sweetMachine = sweetMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void rejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        sweetMachine.releaseBall();
        if(sweetMachine.getCount() > 0){
            sweetMachine.setState(sweetMachine.getNoQuarterState());
        }
        else{
            System.out.println("Oops, out of gumballs!");
            sweetMachine.setState(sweetMachine.getSoldOutState());
        }
    }
}

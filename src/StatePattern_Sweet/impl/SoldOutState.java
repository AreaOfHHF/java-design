package StatePattern_Sweet.impl;

import StatePattern_Sweet.inter.State;
import StatePattern_Sweet.pojo.SweetMachine;

public class SoldOutState implements State{

    private SweetMachine sweetMachine;

    public SoldOutState(SweetMachine sweetMachine) {
        this.sweetMachine = sweetMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void rejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}

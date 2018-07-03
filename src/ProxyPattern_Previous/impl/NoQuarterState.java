package ProxyPattern_Previous.impl;

import ProxyPattern_Previous.inter.State;
import ProxyPattern_Previous.pojo.SweetMachine;

public class NoQuarterState implements State{

    private SweetMachine sweetMachine;

    public NoQuarterState(SweetMachine sweetMachine) {
        this.sweetMachine = sweetMachine;
    }

    @Override
    public void insertQuarter() {
        sweetMachine.setState(sweetMachine.getHasQuarterState());
        System.out.println("You inserted a quarter");
    }

    @Override
    public void rejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    public String toString() {
        return "waiting for quarter";
    }

}

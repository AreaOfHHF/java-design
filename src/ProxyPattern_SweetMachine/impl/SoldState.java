package ProxyPattern_SweetMachine.impl;

import ProxyPattern_SweetMachine.inter.State;
import ProxyPattern_SweetMachine.pojo.SweetMachine;

public class SoldState implements State {

    //不序列化这个字段，不传播于网络之间
    private transient SweetMachine sweetMachine;

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

    @Override
    public String toString() {
        return "dispensing a gumball";
    }

}

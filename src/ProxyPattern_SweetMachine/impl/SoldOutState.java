package ProxyPattern_SweetMachine.impl;

import ProxyPattern_SweetMachine.inter.State;
import ProxyPattern_SweetMachine.pojo.SweetMachine;

public class SoldOutState implements State{

    //不序列化这个字段，不传播于网络之间
    private transient SweetMachine sweetMachine;

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

    @Override
    public String toString() {
        return "sold out";
    }

}

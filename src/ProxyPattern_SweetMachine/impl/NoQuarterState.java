package ProxyPattern_SweetMachine.impl;

import ProxyPattern_SweetMachine.inter.State;
import ProxyPattern_SweetMachine.pojo.SweetMachine;

public class NoQuarterState implements State{

    //不序列化这个字段，不传播于网络之间
    private transient SweetMachine sweetMachine;

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

    @Override
    public String toString() {
        return "waiting for quarter";
    }
}

package ProxyPattern_SweetMachine.impl;

import ProxyPattern_SweetMachine.inter.State;
import ProxyPattern_SweetMachine.pojo.SweetMachine;

public class WinnerState implements State{

    //不序列化这个字段，不传播于网络之间
    private transient SweetMachine sweetMachine;

    public WinnerState(SweetMachine sweetMachine) {
        this.sweetMachine = sweetMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a Gumball");
    }

    @Override
    public void rejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning again doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
        sweetMachine.releaseBall();
        if(sweetMachine.getCount() == 0){
            System.out.println("Oops, out of gumballs!sorry,today you also become a unlucky person");
            sweetMachine.setState(sweetMachine.getSoldOutState());
        }
        else{
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

    @Override
    public String toString() {
        return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
    }

}

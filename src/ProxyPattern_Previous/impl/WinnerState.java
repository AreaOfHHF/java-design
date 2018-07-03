package ProxyPattern_Previous.impl;

import ProxyPattern_Previous.inter.State;
import ProxyPattern_Previous.pojo.SweetMachine;

public class WinnerState implements State{

    private SweetMachine sweetMachine;

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

    public String toString() {
        return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
    }

}

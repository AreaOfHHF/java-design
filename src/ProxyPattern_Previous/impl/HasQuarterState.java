package ProxyPattern_Previous.impl;

import ProxyPattern_Previous.inter.State;
import ProxyPattern_Previous.pojo.SweetMachine;

import java.util.Random;

public class HasQuarterState implements State{
    private SweetMachine sweetMachine;

    private Random random = new Random(System.currentTimeMillis());

    public HasQuarterState(SweetMachine sweetMachine) {
        this.sweetMachine = sweetMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void rejectQuarter() {
        sweetMachine.setState(sweetMachine.getNoQuarterState());
        System.out.println("Quarter returned");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned....");
        int winner = random.nextInt(10);
        if(winner == 0 && sweetMachine.getCount() > 0){
            sweetMachine.setState(sweetMachine.getWinState());
        }
        else{
            sweetMachine.setState(sweetMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        return "waiting for turn of crank";
    }

}

package ProxyPattern_SweetMachine.impl;

import ProxyPattern_SweetMachine.inter.State;
import ProxyPattern_SweetMachine.pojo.SweetMachine;

import java.util.Random;

public class HasQuarterState implements State{

    //不序列化这个字段，不传播于网络之间
    private transient SweetMachine sweetMachine;

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

    @Override
    public String toString() {
        return "waiting for turn of crank";
    }

}

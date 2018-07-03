package ProxyPattern_SweetMachine.pojo;

import ProxyPattern_SweetMachine.impl.*;
import ProxyPattern_SweetMachine.inter.State;
import ProxyPattern_SweetMachine.inter.SweetMachineRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SweetMachine extends UnicastRemoteObject implements SweetMachineRemote{

    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;
    private State winState;

    private String location;
    private int count = 0;
    private State state;

    public SweetMachine(String location,int count) throws RemoteException{
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winState = new WinnerState(this);
        this.count = count;
        this.location = location;
        state = soldState;
        if(count > 0){
            state = noQuarterState;
        }
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getWinState() {
        return winState;
    }

    public void setWinState(State winState) {
        this.winState = winState;
    }

    @Override
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void rejectQuarter(){
        state.rejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall(){
        System.out.println("a sweet comes rolling out the slot...");
        if(count != 0){
            count -= 1;
        }
    }

    public void reFill(int count){
        this.count = count;
        state = noQuarterState;
    }

}

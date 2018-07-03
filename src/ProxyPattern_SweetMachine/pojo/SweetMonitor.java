package ProxyPattern_SweetMachine.pojo;

import ProxyPattern_SweetMachine.inter.SweetMachineRemote;

import java.rmi.RemoteException;

public class SweetMonitor {

    private SweetMachineRemote sweetMachineRemote;

    public SweetMonitor(SweetMachineRemote sweetMachineRemote) {
        this.sweetMachineRemote = sweetMachineRemote;
    }

    public void report() throws RemoteException {
        System.out.println("Gumball Machine: " + sweetMachineRemote.getLocation());
        System.out.println("Current inventory: " + sweetMachineRemote.getCount() + " gumballs");
        System.out.println("Current state: " + sweetMachineRemote.getState());
    }
}

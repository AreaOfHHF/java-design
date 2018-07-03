package ProxyPattern_SweetMachine.inter;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SweetMachineRemote extends Remote{

    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    State getState() throws RemoteException;

}

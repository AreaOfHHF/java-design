package ProxyPattern_SweetMachine;

import ProxyPattern_SweetMachine.inter.SweetMachineRemote;
import ProxyPattern_SweetMachine.pojo.SweetMonitor;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class MonitorTestMain {

    public static void main(String[] args){

        String[] location = {"rmi://localhost:8889/hangzhou",
                             "rmi://localhost:8889/shanghai",
                             "rmi://localhost:8889/guangzhou",
                             "rmi://localhost:8889/beijing"};
        SweetMonitor[] sweetMonitors = new SweetMonitor[location.length];

        for(int i=0;i<location.length;i++){
            try {
                SweetMachineRemote sweetMachineRemote =
                        (SweetMachineRemote) Naming.lookup(location[i]);
                sweetMonitors[i] = new SweetMonitor(sweetMachineRemote);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for(int j=0;j<sweetMonitors.length;j++){
            try {
                sweetMonitors[j].report();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

    }

}

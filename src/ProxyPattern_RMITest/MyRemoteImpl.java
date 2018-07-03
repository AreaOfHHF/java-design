package ProxyPattern_RMITest;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

    public MyRemoteImpl() throws RemoteException{}

    @Override
    public String sayHello() {
        return "Server says, Hey! ";
    }

    public static void main(String[] args){
        try{
            MyRemote service = new MyRemoteImpl();
            LocateRegistry.createRegistry(8888);
            Naming.bind("rmi://localhost:8888/RemoteHello",service);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

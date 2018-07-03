package ProxyPattern_SweetMachine;

import ProxyPattern_SweetMachine.pojo.SweetMachine;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RegisterMain {

    public static void main(String[] args){

        try {
            SweetMachine sweetMachine = new SweetMachine("hangzhou",100);
            LocateRegistry.createRegistry(8889);
            Naming.bind("rmi://localhost:8889/hangzhou",sweetMachine);
            Naming.bind("rmi://localhost:8889/shanghai",sweetMachine);
            Naming.bind("rmi://localhost:8889/guangzhou",sweetMachine);
            Naming.bind("rmi://localhost:8889/beijing",sweetMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

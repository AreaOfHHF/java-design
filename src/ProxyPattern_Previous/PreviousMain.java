package ProxyPattern_Previous;

import ProxyPattern_Previous.pojo.SweetMachine;
import ProxyPattern_Previous.pojo.SweetMonitor;

public class PreviousMain {

    public static void main(String[] args){

        SweetMachine gumballMachine = new SweetMachine("hangzhou",30);
        SweetMonitor monitor = new SweetMonitor(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println("********************************");

        monitor.report();

    }

}

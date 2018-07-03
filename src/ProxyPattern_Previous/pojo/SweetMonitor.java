package ProxyPattern_Previous.pojo;

public class SweetMonitor {

    private SweetMachine sweetMachine;

    public SweetMonitor(SweetMachine sweetMachine) {
        this.sweetMachine = sweetMachine;
    }

    public void report(){
        System.out.println("Sweet Machine: "+sweetMachine.getLocation());
        System.out.println("Current inventory: "+sweetMachine.getCount()+" sweet");
        System.out.println("Current State: "+sweetMachine.getState());
    }

}

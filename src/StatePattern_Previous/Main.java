package StatePattern_Previous;

public class Main {

    public static void main(String[] args){

        SweetMachine sweetMachine = new SweetMachine(5);

        sweetMachine.insert_quarter();
        sweetMachine.turn_crank();

        System.out.println("********************************");

        sweetMachine.insert_quarter();
        sweetMachine.reject_quarter();
        sweetMachine.turn_crank();

        System.out.println("********************************");

        sweetMachine.insert_quarter();
        sweetMachine.turn_crank();
        sweetMachine.insert_quarter();
        sweetMachine.turn_crank();
        sweetMachine.reject_quarter();

        System.out.println("*********************************");

        sweetMachine.insert_quarter();
        sweetMachine.insert_quarter();
        sweetMachine.turn_crank();
        sweetMachine.insert_quarter();
        sweetMachine.turn_crank();
        sweetMachine.insert_quarter();
        sweetMachine.turn_crank();

    }

}

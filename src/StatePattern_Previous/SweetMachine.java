package StatePattern_Previous;

public class SweetMachine {

    public static final int SOLD_OUT = 0;
    public static final int NO_QUARTER = 1;
    public static final int HAS_QUARTER = 2;
    public static final int SOLD = 3;

    private int state = SOLD_OUT;
    private int count = 0;

    public SweetMachine(int count) {
        this.count = count;
        if(count > 0){
            state = NO_QUARTER;
        }
    }

    public void insert_quarter(){
        if(state == NO_QUARTER){
            state = HAS_QUARTER;
            System.out.println("you insert a quarter");
        }
        else if(state == HAS_QUARTER){
            System.out.println("you can't another quarter");
        }
        else if(state == SOLD_OUT){
            System.out.println("you can't insert a quarter,the machine is sold out");
        }
        else{
            System.out.println("Please wait,we're already giving you a sweet");
        }
    }

    public void reject_quarter(){
        if(state == NO_QUARTER){
            System.out.println("you haven't insert a quarter");
        }
        else if(state == HAS_QUARTER){
            System.out.println("a quarter returned");
            state = NO_QUARTER;
        }
        else if(state == SOLD_OUT){
            System.out.println("you can't reject,you haven't inserted a quarter");
        }
        else{
            System.out.println("Sorry,you already turned the crank");
        }
    }

    public void turn_crank(){
        if(state == NO_QUARTER){
            System.out.println("you turned,but there is no quarter");
        }
        else if(state == HAS_QUARTER){
            System.out.println("you turned");
            state = SOLD;
            dispense();
        }
        else if(state == SOLD_OUT){
            System.out.println("you turned,but there is no sweet");
        }
        else{
            System.out.println("turning twice doesn't get you another sweet");
        }
    }

    public void dispense(){
        if(state == SOLD){
            System.out.println("a sweet comes rolling out the slot");
            count -= 1;
            if(count == 0){
                System.out.println("Oops,out of sweet");
                state = SOLD_OUT;
            }
            else{
                state = NO_QUARTER;
            }
        }
        else if(state == SOLD_OUT){
            System.out.println("no sweet dispensed");
        }
        else if(state == NO_QUARTER){
            System.out.println("you need pay first");
        }
        else if(state == HAS_QUARTER){
            System.out.println("no sweet dispensed");
        }
    }

    @Override
    public String toString() {
        return "SweetMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}

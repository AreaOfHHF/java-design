package StatePattern_Sweet;

import java.util.Random;

public class MainTest {

    public static void main(String[] args){

        Random random = new Random(System.currentTimeMillis());
        int winner =  random.nextInt(10);
        System.out.println(winner);

    }

}

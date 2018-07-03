package SingletonPatternClassic.chocolateDemo;

public class Main {

    public static void main(String[] args){
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        chocolateBoiler.isBoiled();
        chocolateBoiler.drain();
        // will return the existing instance
        //ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
    }

}

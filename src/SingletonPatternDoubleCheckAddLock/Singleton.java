package SingletonPatternDoubleCheckAddLock;

//这个方法可以大大地减少getInstance()的时间耗费

public class Singleton {

    private volatile static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}

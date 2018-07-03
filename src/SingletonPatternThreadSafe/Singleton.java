package SingletonPatternThreadSafe;

public class Singleton {

    private static Singleton singleton;

    private Singleton(){}

    //有缺点：只有第一次执行此方法才真正需要同步，因此会降低性能。
    public synchronized static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

}

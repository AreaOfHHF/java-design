package SingletonPatternFast;

public class Singleton {

    //利用这个做法，我们依赖JVM在加载这个类时马上创建唯一的单件实例。
    //JVM保证在任何线程仿问singleton静态变量之前，一定先创建此实例
    //保证了线程安全
    private static Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return singleton;
    }
}

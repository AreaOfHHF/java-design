package SingletonPatternClassic;

// NOTE: This is not thread safe!
public class Singleton {

    // other useful instance variables here
    private static Singleton uniqueInstance;

    //把构造器声明为私有的，只有类内才可以调用构造器。
    private Singleton(){
    }

    //延迟实例化
    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // other useful methods here

}

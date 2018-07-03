package ProxyPattern_JavaAPI;

import ProxyPattern_JavaAPI.impl.NoOwnerInvocationHandler;
import ProxyPattern_JavaAPI.impl.OwnerInvocationHandler;
import ProxyPattern_JavaAPI.impl.PersonBeanImpl;
import ProxyPattern_JavaAPI.inter.PersonBean;

import java.lang.reflect.Proxy;
import java.util.Hashtable;

public class MatchMakingTestDrive {

    private Hashtable db = new Hashtable();

    public MatchMakingTestDrive() {
        initDataBase();
    }

    public static void main(String[] args){
        MatchMakingTestDrive matchMakingTestDrive =
                new MatchMakingTestDrive();
        matchMakingTestDrive.drive();
    }

    private void initDataBase(){
        PersonBean hhf = new PersonBeanImpl();
        hhf.setName("hhf");
        hhf.setGender("男");
        hhf.setInterests("打代码");
        hhf.setHotOrNotRating(10);
        db.put(hhf.getName(),hhf);
        PersonBean tyf = new PersonBeanImpl();
        tyf.setName("tyf");
        tyf.setGender("女");
        tyf.setInterests("购物");
        tyf.setHotOrNotRating(9);
        db.put(tyf.getName(),tyf);
    }

    private PersonBean getOwnerProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean));
    }

    private PersonBean getNoOwnProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NoOwnerInvocationHandler(personBean));
    }

    private PersonBean getFromDataBase(String name){
        return (PersonBean) db.get(name);
    }

    public void drive(){

        PersonBean hhfProxy = getOwnerProxy(getFromDataBase("hhf"));
        PersonBean tyfProxy = getNoOwnProxy(getFromDataBase("tyf"));

        System.out.println(hhfProxy.getName());
        hhfProxy.setInterests("打游戏");
        System.out.println(hhfProxy.getInterests());
        try{
            hhfProxy.setHotOrNotRating(8);
        }catch (Exception e){
            System.out.println("自己不能修改自己的颜值");
        }
        System.out.println(hhfProxy.getHotOrNotRating());

        System.out.println("**************************");

        System.out.println(tyfProxy.getName());
        try{
            tyfProxy.setInterests("化妆");
        }catch (Exception e){
            System.out.println("不能修改别人的兴趣爱好");
        }
        System.out.println(tyfProxy.getInterests());
        tyfProxy.setHotOrNotRating(7);
        System.out.println(tyfProxy.getHotOrNotRating());
    }

}

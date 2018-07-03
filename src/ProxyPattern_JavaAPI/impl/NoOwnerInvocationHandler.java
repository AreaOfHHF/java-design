package ProxyPattern_JavaAPI.impl;

import ProxyPattern_JavaAPI.inter.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NoOwnerInvocationHandler implements InvocationHandler{

    PersonBean personBean;

    public NoOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("get")){
            return method.invoke(personBean,args);
        }
        else if(method.getName().equals("setHotOrNotRating")){
            return method.invoke(personBean,args);
        }
        else if(method.getName().startsWith("set")){
            throw new IllegalAccessException();
        }
        return null;
    }
}

package com.cuishifeng.learn.advance;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by cuishifeng on 2018/5/30.
 */
public class ProxyHandler implements InvocationHandler{

    private Object obj;

    public Object DynamicAent(String className){
        Class clazz = reflect(className);
        try {
            this.obj = (Object)clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Class reflect(String className){
        Class clazz = null;
        try {
            clazz =  Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return clazz;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("++++++++++++ 动态代理 start");
        Object ret = method.invoke(obj,args);
        System.out.println("++++++++++++ 动态代理 end");
        return ret;
    }
}

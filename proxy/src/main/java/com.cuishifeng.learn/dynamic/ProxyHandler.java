package com.cuishifeng.learn.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by cuishifeng on 2018/5/29.
 */
public class ProxyHandler implements InvocationHandler {

    public Object obj;

    public Object DynamicAent(Object obj){
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("+++++++++ 动态代理 start +++++++++++");
        method.invoke(obj,args);
        System.out.println("+++++++++ 动态代理 end +++++++++++");
        return null;
    }
}

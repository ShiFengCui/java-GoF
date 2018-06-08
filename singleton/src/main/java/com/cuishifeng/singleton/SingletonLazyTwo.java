package com.cuishifeng.singleton;

/**
 * @author cuishifeng
 * @create 2018-06-06
 **/
public class SingletonLazyTwo {

    /**
     * 懒汉模式 - 线程安全 - 方法上加同步
     */
    private static SingletonLazyTwo singletonLazyTwo = null;

    private SingletonLazyTwo(){}

    public static synchronized SingletonLazyTwo getInstance(){
        if (singletonLazyTwo == null){
            singletonLazyTwo = new SingletonLazyTwo();
        }
        return singletonLazyTwo;
    }
}

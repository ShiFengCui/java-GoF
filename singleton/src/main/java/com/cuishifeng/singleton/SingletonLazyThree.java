package com.cuishifeng.singleton;

/**
 * @author cuishifeng
 * @create 2018-06-06
 **/
public class SingletonLazyThree {

    /**
     * 懒汉模式 - 线程安全 - 双重锁校验
     */
    private static SingletonLazyThree singletonLazyThree = null;

    private SingletonLazyThree(){}

    public static SingletonLazyThree getInstance(){

        if (singletonLazyThree == null){

            synchronized (SingletonLazyThree.class){
                if (singletonLazyThree == null){
                    singletonLazyThree = new SingletonLazyThree();
                }
            }
        }
        return singletonLazyThree;
    }
}

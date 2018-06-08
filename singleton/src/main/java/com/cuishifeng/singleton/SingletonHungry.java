package com.cuishifeng.singleton;

/**
 * @author cuishifeng
 * @create 2018-06-06
 **/

public class SingletonHungry {

    /**
     * 饿汉模式
     */

    private static SingletonHungry singletonHungry = new SingletonHungry();

    private SingletonHungry(){ }

    public static SingletonHungry getInstance(){
        return singletonHungry;
    }
}

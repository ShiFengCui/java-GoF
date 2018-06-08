package com.cuishifeng.singleton;

/**
 * @author cuishifeng
 * @create 2018-06-06
 **/
public class SingletonLazy {

    /**
     * 懒汉模式
     */

    /*
     * 懒汉模式不是线程安全的
     * 在并发环境下可能会出现多个实例
     * https://blog.csdn.net/jason0539/article/details/23297037/
     *
     */
    private static SingletonLazy singleton = null;

    private SingletonLazy(){}

    public static SingletonLazy getInstance(){

        if (singleton == null){
            singleton = new SingletonLazy();
        }
        return singleton;
    }

}

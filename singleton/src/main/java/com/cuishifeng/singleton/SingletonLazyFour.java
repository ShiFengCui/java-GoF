package com.cuishifeng.singleton;

/**
 * @author cuishifeng
 * @create 2018-06-06
 **/
public class SingletonLazyFour {

    /**
     * 懒汉模式 - 线程安全 - 静态内部类
     */

    private SingletonLazyFour(){}

    private static class LazyLoad{
        public static final SingletonLazyFour SINGLETON_LAZY_FOUR = new SingletonLazyFour();
    }

    public static final SingletonLazyFour getInstance(){
        return LazyLoad.SINGLETON_LAZY_FOUR;
    }
}

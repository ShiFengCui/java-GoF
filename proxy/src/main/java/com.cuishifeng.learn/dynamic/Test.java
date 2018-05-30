package com.cuishifeng.learn.dynamic;

/**
 * Created by cuishifeng on 2018/5/29.
 */
public class Test {

    public static void main(String[] args) {

        ProxyHandler proxy = new ProxyHandler();

        Car car = (Car) proxy.DynamicAent(new Customer());
        car.buyCar();
        System.out.println("---------------------------------");
        car.sellCar();
        System.out.println("---------------------------------");
        car.seeCar();

/** 打印结果 */
//        +++++++++ 动态代理 start +++++++++++
//                我要买一辆法拉利！
//        +++++++++ 动态代理 end +++++++++++
//       ---------------------------------
//        +++++++++ 动态代理 start +++++++++++
//                我要卖一辆兰博基尼！
//        +++++++++ 动态代理 end +++++++++++
//        ---------------------------------
//        +++++++++ 动态代理 start +++++++++++
//                我要去4S店去看看车！
//        +++++++++ 动态代理 end +++++++++++

    }
}

package com.cuishifeng.learn.dynamic;

/**
 * Created by cuishifeng on 2018/5/29.
 */
public class Customer implements Car {

    @Override
    public void buyCar() {
        System.out.println("我要买一辆法拉利！");
    }

    @Override
    public void sellCar() {
        System.out.println("我要卖一辆兰博基尼！");
    }

    @Override
    public void seeCar() {
        System.out.println("我要去4S店去看看车！");
    }
}

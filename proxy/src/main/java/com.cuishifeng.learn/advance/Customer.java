package com.cuishifeng.learn.advance;

/**
 * Created by cuishifeng on 2018/5/30.
 */
public class Customer implements Car {

    @Override
    public void buyCar() {
        System.out.println("顾客去购买一辆法拉利！");
    }
}

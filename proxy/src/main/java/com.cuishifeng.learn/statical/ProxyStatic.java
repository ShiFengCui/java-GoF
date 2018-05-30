package com.cuishifeng.learn.statical;



/**
 * Created by cuishifeng on 2018/5/29.
 */
public class ProxyStatic {

    Car car = new Customer();

    public void buyCar(){
        System.out.println("+++++++++++++++ 来到4S店看车付钱 +++++++++++++++");
        car.buyCar();
        System.out.println("+++++++++++++++ 开着法拉利回家 +++++++++++++++");
    }
}

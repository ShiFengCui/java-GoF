package com.cuishifeng.learn.advance;

/**
 * Created by cuishifeng on 2018/5/30.
 */
public class Test {

    public static void main(String[] args) {

        ProxyHandler proxy = new ProxyHandler();

        Car customer = (Car)proxy.DynamicAent("com.cuishifeng.learn.advance.Customer");
        customer.buyCar();
//        ++++++++++++ 动态代理 start
//        顾客去购买一辆法拉利！
//        ++++++++++++ 动态代理 end

        Car dealer = (Car)proxy.DynamicAent("com.cuishifeng.learn.advance.Dealer");
        dealer.buyCar();

//        ++++++++++++ 动态代理 start
//        车商要去批量收购一批车！
//        ++++++++++++ 动态代理 end

        Food apple = (Food)proxy.DynamicAent("com.cuishifeng.learn.advance.Apple");
        apple.foodType();

//        ++++++++++++ 动态代理 start
//        我是一个苹果！
//        ++++++++++++ 动态代理 end

        Food banana = (Food)proxy.DynamicAent("com.cuishifeng.learn.advance.Banana");
        banana.foodType();

//        ++++++++++++ 动态代理 start
//        我是一个香蕉！
//        ++++++++++++ 动态代理 end
    }
}

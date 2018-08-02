package com.cuihsifeng.factory.abstraction;

/**
 * @author cuishifeng
 * @create 2018-08-02
 **/

public class AppClient {

    public static void main(String[] args) {

        System.out.println("--------- 第一台 ---------");
        IFactory factory = new ProductFactoryA();
        factory.getComputer().productComputer();
        factory.getMouse().productMouse();

        System.out.println("--------- 第二台 ---------");
        factory = new ProductFactoryB();
        factory.getComputer().productComputer();
        factory.getMouse().productMouse();
    }
}

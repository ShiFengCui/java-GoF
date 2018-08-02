package com.cuihsifeng.factory.method;

/**
 * 客户端
 * @author cuishifeng
 * @create 2018-08-02
 **/
public class AppClient {

    public static void main(String[] args) {
        ComputerFactory computerFactory = new CpuFactory();
        computerFactory.getProduct().createComputer();

        System.out.println("---------------------------- ");

        computerFactory = new DiskFactory();
        computerFactory.getProduct().createComputer();

        System.out.println("---------------------------- ");

        computerFactory = new DisplayerFactory();
        computerFactory.getProduct().createComputer();

    }
}

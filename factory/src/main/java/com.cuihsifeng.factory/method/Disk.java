package com.cuihsifeng.factory.method;

/**
 * @author cuishifeng
 * @create 2018-08-02
 **/
public class Disk implements Computer {

    @Override
    public void createComputer() {
        System.out.println("生产磁盘disk");
    }
}

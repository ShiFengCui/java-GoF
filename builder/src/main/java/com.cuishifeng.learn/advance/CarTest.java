package com.cuishifeng.learn.advance;

/**
 * Created by cuishifeng on 2018/5/30.
 */
public class CarTest {

    public static void main(String[] args) {

        Car car = Car.CarBuilder.builder()
                .setBrand("奔驰")
                .setSteering("4座")
                .setColor("黑色")
                .setLog("记录生活日志")
                .setTool("此次使用的是建造者模式")
                .build();

        System.out.println(car.toString());

    }
}

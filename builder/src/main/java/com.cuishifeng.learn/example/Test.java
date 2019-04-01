package com.cuishifeng.learn.example;

/**
 * Created by cuishifeng on 2018/5/30.
 */
public class Test {

    public static void main(String[] args) {

        Builder builder = new CarBuilder();
        Director director = new Director(builder);

        Car car1 = director.createCar("德国汽车底盘","发过进口座椅","中国轮胎");
        System.out.println(car1.toString());

        // 如果不使用指挥者

        builder.buildSteering("中国轮胎");
        builder.buildSeat("中国座椅");
        builder.buildChassis("中国底盘");
        Car car2 = builder.create();
        System.out.println(car2.toString());
    }

}

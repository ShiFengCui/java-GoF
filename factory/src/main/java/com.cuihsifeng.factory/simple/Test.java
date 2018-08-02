package com.cuihsifeng.factory.simple;

/**
 * @author cuishifeng
 * @create 2018-07-13
 **/

public class Test {

    public static void main(String[] args) {

        Car car = CarFactory.createCar("BenChiCar");
        car.myCar();

        Car car2 = CarFactory.createCar("FerrariCar");
        car2.myCar();
    }
}

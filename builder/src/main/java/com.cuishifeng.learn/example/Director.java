package com.cuishifeng.learn.example;

/**
 * Created by cuishifeng on 2018/5/30.
 */
public class Director {


    Builder builder = null;


    public Director(Builder builder){
        this.builder = builder;
    }


    public Car createCar(String chassis,String seat,String steering){

        builder.buildChassis(chassis);
        builder.buildSeat(seat);
        builder.buildSteering(steering);
        return builder.create();

    }
}

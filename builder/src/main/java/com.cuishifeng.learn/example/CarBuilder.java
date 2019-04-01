package com.cuishifeng.learn.example;

/**
 * Created by cuishifeng on 2018/5/30.
 */
public class CarBuilder extends Builder {

    private Car car = new Car();

    @Override
    public void buildChassis(String chassis) {
        car.setChassis(chassis);
    }

    @Override
    public void buildSeat(String seat) {
        car.setSeat(seat);
    }

    @Override
    public void buildSteering(String steering) {
        car.setSteering(steering);
    }

    @Override
    public Car create() {
        return this.car;
    }
}

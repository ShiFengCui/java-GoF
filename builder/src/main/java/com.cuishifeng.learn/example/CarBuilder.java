package com.cuishifeng.learn.example;

/**
 * Created by cuishifeng on 2018/5/30.
 */
public class CarBuilder extends Builder {

    private Car car = new Car();

    public void buildChassis(String chassis) {
            car.setChassis(chassis);
    }

    public void buildSeat(String seat) {
            car.setSeat(seat);
    }

    public void buildSteering(String steering) {
            car.setSteering(steering);
    }

    public Car create() {
        return this.car;
    }
}

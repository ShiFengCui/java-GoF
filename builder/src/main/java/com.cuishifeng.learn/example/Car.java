package com.cuishifeng.learn.example;

/**
 * Created by cuishifeng on 2018/5/30.
 */
public class Car {

    // 汽车底盘
    private String chassis;
    // 汽车轮胎
    private String steering;
    // 汽车座椅
    private String seat;

    public String getChassis() {
        return chassis;
    }

    public String getSteering() {
        return steering;
    }

    public String getSeat() {
        return seat;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Car{" +
                "chassis='" + chassis + '\'' +
                ", steering='" + steering + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}

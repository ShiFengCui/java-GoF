package com.cuishifeng.learn.example;

/**
 * Created by cuishifeng on 2018/5/30.
 */
public abstract class Builder {

    public abstract void buildChassis(String chassis);

    public abstract void buildSeat(String seat);

    public abstract void buildSteering(String steering);

    public abstract Car create();
}

package com.cuishifeng.learn.example.test1;

/**
 * @author cuishifeng
 * @date 2019-04-01
 */
public abstract class Builder {


    public abstract void setCpu(String cpu);

    public abstract void setBrand(String brand);

    public abstract void setMouse(String mouse);

    public abstract Computer createComputer();

}

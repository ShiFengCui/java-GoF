package com.cuishifeng.learn.example.test1;

/**
 * @author cuishifeng
 * @date 2019-04-01
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Computer createComputer(String cpu, String brand, String mouse) {
        builder.setBrand(brand);
        builder.setCpu(cpu);
        builder.setMouse(mouse);
        return builder.createComputer();
    }
}

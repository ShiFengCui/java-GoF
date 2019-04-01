package com.cuishifeng.learn.example.test1;

/**
 * @author cuishifeng
 * @date 2019-04-01
 */
public class Computer {

    /**
     * 建造者模式中的产品构造器一定是私有的
     */
    private Computer() {

    }

    private String brand;

    private String cpu;

    private String mouse;

    public String getBrand() {
        return brand;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMouse() {
        return mouse;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                ", mouse='" + mouse + '\'' +
                '}';
    }
}

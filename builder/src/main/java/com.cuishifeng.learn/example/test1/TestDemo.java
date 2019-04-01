package com.cuishifeng.learn.example.test1;

/**
 * @author cuishifeng
 * @date 2019-04-01
 */
public class TestDemo {

    public static void main(String[] args) {

        Builder builder = new ComputerBuilder();
        Director director = new Director(builder);
        Computer computer = director.createComputer("1核CPU", "苹果", "无线鼠标");
        computer.toString();
    }


}

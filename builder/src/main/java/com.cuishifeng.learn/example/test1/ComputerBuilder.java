package com.cuishifeng.learn.example.test1;

/**
 * @author cuishifeng
 * @date 2019-04-01
 */
public class ComputerBuilder extends Builder {

    private Computer computer = new Computer();

    @Override
    public void setCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void setBrand(String brand) {
        computer.setBrand(brand);
    }

    @Override
    public void setMouse(String mouse) {
        computer.setMouse(mouse);
    }

    @Override
    public Computer createComputer() {
        return this.computer;
    }

}

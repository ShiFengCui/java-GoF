package com.cuihsifeng.factory.abstraction;

/**
 * @author cuishifeng
 * @create 2018-08-02
 **/
public class ProductFactoryA implements IFactory {

    @Override
    public Computer getComputer() {
        return new PcComputer();
    }

    @Override
    public Mouse getMouse() {
        return new OfficeMouse();
    }
}

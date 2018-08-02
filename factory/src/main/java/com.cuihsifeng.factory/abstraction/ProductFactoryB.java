package com.cuihsifeng.factory.abstraction;

/**
 * @author cuishifeng
 * @create 2018-08-02
 **/
public class ProductFactoryB implements IFactory {
    @Override
    public Computer getComputer() {
        return new ServerComputer();
    }

    @Override
    public Mouse getMouse() {
        return new GameMouse();
    }
}

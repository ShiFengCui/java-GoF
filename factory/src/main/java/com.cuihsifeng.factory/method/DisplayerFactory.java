package com.cuihsifeng.factory.method;

/**
 * @author cuishifeng
 * @create 2018-08-02
 **/
public class DisplayerFactory implements ComputerFactory {
    @Override
    public Computer getProduct() {
        return new Displayer();
    }
}

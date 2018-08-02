package com.cuihsifeng.factory.abstraction;

/**
 * PC计算机具体产品类
 * @author cuishifeng
 * @create 2018-08-02
 **/
public class PcComputer extends Computer {

    @Override
    public void productComputer() {
        System.out.println("PC端计算机");
    }
}

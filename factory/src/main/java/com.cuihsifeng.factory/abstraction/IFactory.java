package com.cuihsifeng.factory.abstraction;

/**
 * @author cuishifeng
 * @create 2018-08-02
 **/
public interface IFactory {

    /**
     * 获取计算机
     * @return
     */
    Computer getComputer();

    /**
     * 获取鼠标
     * @return
     */
    Mouse getMouse();

}

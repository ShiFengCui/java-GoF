package com.cuishifeng.designmode.demo;

/**
 * 抽象状态
 *
 * @author cuishifeng
 * @Title: AbstractState
 * @ProjectName com.cuishifeng.designmode.demo
 * @date 2018-11-24
 */
public abstract class AbstractState {


    public abstract void handler();


    /**
     * 具体状态 - 步行
     */
    public static class Walk extends AbstractState {

        @Override
        public void handler() {
            System.out.println("步行到达目的地 : 时间 1 小时");
        }
    }

    /**
     * 具体状态 - 自行车
     */
    public static class Bike extends AbstractState {

        @Override
        public void handler() {
            System.out.println("骑自行车到达目的地 : 时间 30 分钟");
        }
    }

    /**
     * 具体状态 - 驾车
     */
    public static class Car extends AbstractState {

        @Override
        public void handler() {
            System.out.println("驾车到达目的地 : 时间 10 分钟");
        }
    }

}

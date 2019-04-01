package com.cuishifeng.learn.demo;

/**
 * 出租车 - 具体策略类
 *
 * @author cuishifeng
 * @Title: TaxiStragety
 * @ProjectName com.cuishifeng.learn.demo
 * @date 2018-11-11
 */
public class TaxiStragety implements Stragety {
    @Override
    public int price(int distance) {
        return 10 * distance + 20;
    }
}

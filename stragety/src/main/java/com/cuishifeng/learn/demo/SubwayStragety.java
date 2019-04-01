package com.cuishifeng.learn.demo;

/**
 * 公交车 - 具体策略类
 *
 * @author cuishifeng
 * @Title: SubwayStragety
 * @ProjectName com.cuishifeng.learn.demo
 * @date 2018-11-11
 */
public class SubwayStragety implements Stragety {

    @Override
    public int price(int distance) {
        return 5 * distance + 10;
    }
}

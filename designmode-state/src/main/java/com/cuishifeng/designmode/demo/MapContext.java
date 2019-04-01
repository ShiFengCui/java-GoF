package com.cuishifeng.designmode.demo;

/**
 * 上下文 -  地图
 *
 * @author cuishifeng
 * @Title: MapContext
 * @ProjectName com.cuishifeng.designmode.demo
 * @date 2018-11-24
 */
public class MapContext {

    /**
     * 状态
     */
    private AbstractState state;

    public MapContext(AbstractState state) {
        this.state = state;
    }

    /**
     * 行为
     */
    public void routeWay() {
        state.handler();
    }
}

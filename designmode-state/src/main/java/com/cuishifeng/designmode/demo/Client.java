package com.cuishifeng.designmode.demo;

/**
 * @author cuishifeng
 * @Title: Client
 * @ProjectName com.cuishifeng.designmode.demo
 * @date 2018-11-24
 */
public class Client {


    public static void main(String[] args) {

        // 骑行车
        MapContext map = new MapContext(new AbstractState.Bike());
        map.routeWay();
        //输出：
//        骑自行车到达目的地 : 时间 30 分钟


        // 开车
        MapContext map2 = new MapContext(new AbstractState.Car());
        map2.routeWay();
        //输出：
//         驾车到达目的地 : 时间 10 分钟
    }
}

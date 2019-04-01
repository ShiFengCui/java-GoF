package com.cuishifeng.learn.demo;

/**
 * @author cuishifeng
 * @Title: ClientTest
 * @ProjectName com.cuishifeng.learn.demo
 * @date 2018-11-11
 */
public class ClientTest {

    private Stragety stragety;

    public ClientTest(Stragety stragety) {
        this.stragety = stragety;
    }

    public int calculateMoney(int distance) {
        return stragety.price(distance);
    }

    public static void main(String[] args) {

        ClientTest clientTest = new ClientTest(new TaxiStragety());

        int money = clientTest.calculateMoney(12);

        System.out.println("乘坐出租车消费多少钱：" + money);

        ClientTest clientTest2 = new ClientTest(new SubwayStragety());

        int money2 = clientTest2.calculateMoney(12);

        System.out.println("乘坐公交车消费多少钱：" + money2);

//        乘坐出租车消费多少钱：140
//        乘坐公交车消费多少钱：70
    }
}

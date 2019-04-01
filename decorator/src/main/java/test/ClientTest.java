package test;

import demo.*;

/**
 * @author cuishifeng
 * @Title: ClientTest
 * @ProjectName test
 * @date 2018-11-13
 */
public class ClientTest {

    public static void main(String[] args) {

        Dine dine = new ZhangSan();

        DineDecorator tableware = new TablewareDecorator(dine);
        DineDecorator napkin = new NapkinDecorator(dine);

        tableware.eat();
        napkin.eat();

        String str = new String();

    }
}

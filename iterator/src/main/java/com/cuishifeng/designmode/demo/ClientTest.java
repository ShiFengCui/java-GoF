package com.cuishifeng.designmode.demo;

/**
 * @author cuishifeng
 * @Title: ClientTest
 * @ProjectName com.cuishifeng.designmode.demo
 * @date 2018-11-23
 */
public class ClientTest {


    public static void main(String[] args) {

        Aggregate aggregate = new ConcreteAggregate();

        aggregate.add("a");
        aggregate.add("b");
        aggregate.add("c");

        Iterator iterator = aggregate.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        a
//        b
//        c
    }
}

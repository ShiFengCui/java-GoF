package com.cuishifeng.designmode.demo;

/**
 * @author cuishifeng
 * @Title: Aggregate
 * @ProjectName com.cuishifeng.designmode.demo
 * @date 2018-11-23
 */
public interface Aggregate<T> {


    void add(T obj);

    T get(int index);

    Iterator iterator();

    int getSize();
}

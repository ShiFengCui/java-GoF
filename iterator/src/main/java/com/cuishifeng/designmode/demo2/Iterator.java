package com.cuishifeng.designmode.demo2;

/**
 * 抽象迭代器
 *
 * @author cuishifeng
 * @Title: Iterator
 * @ProjectName com.cuishifeng.designmode.demo
 * @date 2018-11-23
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();

}

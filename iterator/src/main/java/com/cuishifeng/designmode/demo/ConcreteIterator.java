package com.cuishifeng.designmode.demo;

/**
 * @author cuishifeng
 * @Title: ConcreteIterator
 * @ProjectName com.cuishifeng.designmode.demo
 * @date 2018-11-23
 */
public class ConcreteIterator implements Iterator {

    private Aggregate aggregate;
    private int index;

    public ConcreteIterator(Aggregate aggregate) {
        super();
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        if (index >= aggregate.getSize()) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return aggregate.get(index++);
    }

}

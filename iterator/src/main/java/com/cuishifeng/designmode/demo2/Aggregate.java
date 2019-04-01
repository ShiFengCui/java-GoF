package com.cuishifeng.designmode.demo2;

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


    /**
     * 抽象容器中 定义内部类具体的迭代器实现
     */
    class ConcreteIterator implements Iterator {

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
}

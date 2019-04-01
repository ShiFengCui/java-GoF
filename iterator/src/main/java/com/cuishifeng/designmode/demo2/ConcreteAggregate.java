package com.cuishifeng.designmode.demo2;


/**
 * @author cuishifeng
 * @Title: ConcreteAggregate
 * @ProjectName com.cuishifeng.designmode.demo
 * @date 2018-11-23
 */
public class ConcreteAggregate implements Aggregate<String> {

    private String[] value;

    private int size;
    private int index;

    public ConcreteAggregate() {
        this.index = 0;
        this.size = 0;
        this.value = new String[20];
    }


    @Override
    public void add(String obj) {
        value[size++] = obj;
        this.index++;
    }

    @Override
    public String get(int index) {
        return value[index];
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public int getSize() {
        return size;
    }


    public static void main(String[] args) {

        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("123");
        aggregate.add("456");
        aggregate.add("789");

        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

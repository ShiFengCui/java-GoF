package com.cuishifeng.learn;

import lombok.Getter;
import lombok.Setter;

/**
 * @author cuishifeng
 * Created on 2020-06-16
 */
@Getter
@Setter
public class Animal implements Cloneable {

    private String name;
    private String big;

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setName("老虎");
        animal.setBig("肉食动物");

        Animal animal2 = (Animal) animal.clone();
        animal2.setName("狮子");

        // 通过对原型的复制克隆 我们无需对所有参数改动，只需要更改新对象不同表现形式的字段
    }
}

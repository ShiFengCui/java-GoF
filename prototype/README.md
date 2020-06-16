
## 原型模式

> 创建现有对象的副本并根据需要对其进行修改，而不必麻烦地从头创建对象并进行设置

```java
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

```
java中的克隆可以是原型模式

- 浅拷贝 只对基本数据类型值进行拷贝 引用类型进行引用传递，而不是创建新的对象
- 深拷贝 对基本数据值进行拷贝 引用类型会创建新的对象重新把新对象引用赋值
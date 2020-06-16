

构建器模式是一种对象创建软件设计模式，旨在为伸缩构造器反模式找到解决方案。

- 创建复杂对象的算法应独立于组成对象的零件及其组装方式
- 构造过程必须允许所构造的对象具有不同的表示形式

> 通过对象本身实现对象不同表现形式需要创建不同的构造器去满足，用setter呢对象在创建完成后仍然是可变的
> 所以构造器模式是为创建复杂允许不同表现形式不可变对象而生怼

### 建造者和产品

✅   使用建造者模式我们绝大部分会是这样去使用，将建造者定义为内部静态类

```java
package com.cuishifeng.learn.builder20200612;

import lombok.ToString;

/**
 * @author cuishifeng
 * Created on 2020-06-12
 */
@ToString
public class Food {

    private final String fruit;

    private final String drink;

    private final String dessert;

    private final String dish;


    public Food(Builder builder) {
        this.fruit = builder.fruit;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
        this.dish = builder.dish;
    }

    public String getFruit() {
        return fruit;
    }

    public String getDrink() {
        return drink;
    }

    public String getDessert() {
        return dessert;
    }

    public String getDish() {
        return dish;
    }

    public static class Builder {
        private String fruit;
        private String drink;
        private String dessert;
        private String dish;

        public Builder setFruit(String fruit) {
            this.fruit = fruit;
            return this;
        }

        public Builder setDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder setDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public Builder setDish(String dish) {
            this.dish = dish;
            return this;
        }

        public Food build() {
            return new Food(this);
        }

    }

}

```


一旦完成建造，调用build方法 这个对象就不可变了。

### Real world examples
- java.lang.StringBuilder
- java.nio.ByteBuffer as well as similar buffers such as FloatBuffer, IntBuffer and so on.
- java.lang.StringBuffer
- All implementations of java.lang.Appendable
- Apache Camel builders
- Apache Commons Option.Builder










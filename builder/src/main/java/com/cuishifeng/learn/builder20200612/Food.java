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

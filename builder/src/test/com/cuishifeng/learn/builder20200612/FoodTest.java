package com.cuishifeng.learn.builder20200612;

import org.junit.Test;

/**
 * @author cuishifeng
 * Created on 2020-06-12
 */
public class FoodTest {


    @Test
    public void test() throws Exception {

        Food food = new Food.Builder()
                .setFruit("苹果")
                .setDessert("奶油蛋糕")
                .build();

        System.out.println(food.toString());

    }

}
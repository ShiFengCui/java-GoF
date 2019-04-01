package com.cuishifeng.learn.demo2;

/**
 * @author cuishifeng
 * @date 2018-12-12
 */
public class Test {

    public static void main(String[] args) {

        User user = new User.UserBuilder()
                .setName("tom")
                .setAge(18)
                .build();

        System.out.println(user.toString());
    }
}

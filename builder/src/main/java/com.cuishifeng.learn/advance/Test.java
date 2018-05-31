package com.cuishifeng.learn.advance;

/**
 * Created by cuishifeng on 2018/5/30.
 */
public class Test {

    public static void main(String[] args) {
        User user = new User.UserBuilder("Jhon", "Doe")
                .address("北京")
                .age(20)
//                .phone("123456")
                .build();

        User user2 = new User.UserBuilder("Jhon", "Doe")
                .address("北京")
                .age(20)
                .phone("123456")
                .build();
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
    }
}

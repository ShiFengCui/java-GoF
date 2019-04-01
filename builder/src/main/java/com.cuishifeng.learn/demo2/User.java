package com.cuishifeng.learn.demo2;

/**
 * @author cuishifeng
 * @date 2018-12-12
 */
public class User {

    /**
     * 这是使用静态内部类的形式创建的建造者模式
     *
     *
     *
     */

    private String name;
    private int age;

    private User(UserBuilder userBuilder) {
        this.age = userBuilder.getAge();
        this.name = userBuilder.getName();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    static class UserBuilder {

        private String name;
        private int age;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public User build() {
            return new User(this);
        }
    }

}

package test;

/**
 * @author cuishifeng
 * @Title: Person
 * @ProjectName test
 * @date 2018-11-13
 */
public abstract class Person {

    private String name;

    public Person(String name) {
        this.name = name;
        System.out.println("父类有参构造方法 name: " + name);
    }

    static class ZhangSan extends Person {

        public ZhangSan(String name) {
            super(name);
            System.out.println("子类有参构造方法 name: " + name);
        }
    }

    public static void main(String[] args) {

        Person person = new ZhangSan("hello");

//    打印输出：
//        父类有参构造方法 name: hello
//        子类有参构造方法 name: hello

    }
}

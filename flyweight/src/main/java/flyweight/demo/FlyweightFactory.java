package flyweight.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 *
 * @author cuishifeng
 * @Title: FlyweightFactory
 * @ProjectName flyweight.demo
 * @date 2018-11-15
 */
public class FlyweightFactory {

    private static Map<String, Flyweight> map = new HashMap<>();

    public static Flyweight getFlyweight(String key) {

        if (map.containsKey(key)) {
            return map.get(key);
        } else {
            Flyweight flyweight = new ConcreteFlyweight(key);
            map.put(key, flyweight);
            return flyweight;
        }
    }

    public static void main(String[] args) {

        Flyweight flyweight = FlyweightFactory.getFlyweight("abc");
        flyweight.operation("hello");

        // 外部状态 - hello = 内部状态: abc
    }

}

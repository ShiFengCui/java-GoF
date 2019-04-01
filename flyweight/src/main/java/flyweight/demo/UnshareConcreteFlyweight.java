package flyweight.demo;

/**
 * 非共享具体享元类
 *
 * @author cuishifeng
 * @Title: UnshareConcreteFlyweight
 * @ProjectName flyweight.demo
 * @date 2018-11-15
 */
public class UnshareConcreteFlyweight implements Flyweight {


    @Override
    public void operation(String externalState) {
        System.out.println("非共享享元类 - " + externalState);
    }
}

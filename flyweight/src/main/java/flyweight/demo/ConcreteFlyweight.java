package flyweight.demo;

/**
 * 具体享元类
 *
 * @author cuishifeng
 * @Title: ConcreteFlyweight
 * @ProjectName flyweight.demo
 * @date 2018-11-15
 */
public class ConcreteFlyweight implements Flyweight {

    private String internalState;

    public ConcreteFlyweight(String internalState) {
        this.internalState = internalState;
    }

    @Override
    public void operation(String externalState) {
        System.out.println("外部状态 - " + externalState + " = 内部状态: " + internalState);
    }
}

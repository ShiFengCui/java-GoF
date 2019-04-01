package demo;

/**
 * 抽象装饰类
 *
 * @author cuishifeng
 * @Title: DineDecorator
 * @ProjectName demo
 * @date 2018-11-13
 */
public abstract class DineDecorator implements Dine {

    private Dine dine;

    public DineDecorator(Dine dine) {
        this.dine = dine;
    }

    @Override
    public void eat() {
        dine.eat();
    }
}

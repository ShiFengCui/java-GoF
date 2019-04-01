package demo;

/**
 * 具体装饰类 - 上餐具
 *
 * @author cuishifeng
 * @Title: TablewareDecorator
 * @ProjectName demo
 * @date 2018-11-13
 */
public class TablewareDecorator extends DineDecorator {

    public TablewareDecorator(Dine dine) {
        super(dine);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("餐具 - 筷子 勺子 放到桌子上");
    }
}

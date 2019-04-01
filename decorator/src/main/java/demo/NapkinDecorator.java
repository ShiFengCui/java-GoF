package demo;

/**
 * 具体装饰类 - 上餐巾
 *
 * @author cuishifeng
 * @Title: NapkinDecorator
 * @ProjectName demo
 * @date 2018-11-13
 */
public class NapkinDecorator extends DineDecorator {


    public NapkinDecorator(Dine dine) {
        super(dine);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("餐巾纸 - 餐巾纸放到桌子上");
    }
}

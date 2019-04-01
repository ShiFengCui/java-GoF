package demo;

/**
 * 具体构件 - 上菜上饭
 *
 * @author cuishifeng
 * @Title: ZhangSan
 * @ProjectName demo
 * @date 2018-11-13
 */
public class ZhangSan implements Dine {

    @Override
    public void eat() {
        System.out.println("进餐 - 上菜上饭 - 三菜一汤");
    }
}

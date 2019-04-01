package observer.demo;

/**
 * 具体观察者 - 年级主任
 *
 * @author cuishifeng
 * @Title: ClassDeansObserver
 * @ProjectName observer.demo
 * @date 2018-11-10
 */
public class ClassDeansObserver implements Observer {

    private String name;

    public ClassDeansObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {

        System.out.println("观察者: " + name + " 收到通知- " + message);
    }

}

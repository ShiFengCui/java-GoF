package observer.demo;

/**
 * 观察者 - 校长
 *
 * @author cuishifeng
 * @Title: SchoolMasterObserver
 * @ProjectName observer.demo
 * @date 2018-11-10
 */
public class SchoolMasterObserver implements Observer {
    private String name;

    public SchoolMasterObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {

        System.out.println("观察者: " + name + " 收到通知- " + message);
    }
}

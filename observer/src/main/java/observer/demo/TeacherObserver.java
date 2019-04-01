package observer.demo;

/**
 * 具体观察者 - 老师
 *
 * @author cuishifeng
 * @Title: TeacherObserver
 * @ProjectName observer.demo
 * @date 2018-11-10
 */
public class TeacherObserver implements Observer {

    private String name;

    public TeacherObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {

        System.out.println("观察者: " + name + " 收到通知- " + message);
    }
}

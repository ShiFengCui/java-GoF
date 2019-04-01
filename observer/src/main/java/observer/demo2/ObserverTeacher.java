package observer.demo2;

/**
 * @author cuishifeng
 * @date 2018-12-08
 */
public class ObserverTeacher implements Observer {
    @Override
    public void notify(String state) {
        System.out.println("老师收到通知 - " + state);
    }
}

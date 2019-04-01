package observer.demo2;

/**
 * @author cuishifeng
 * @date 2018-12-08
 */
public class ObserverFather implements Observer {

    @Override
    public void notify(String state) {
        System.out.println("家长收到通知 - " + state);
    }
}

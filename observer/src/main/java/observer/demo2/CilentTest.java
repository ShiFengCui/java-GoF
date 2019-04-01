package observer.demo2;

/**
 * @author cuishifeng
 * @date 2018-12-08
 */
public class CilentTest {


    public static void main(String[] args) {

        Subject subject = new ConcreteSubject();

        subject.addObserver(new ObserverFather());
        subject.addObserver(new ObserverTeacher());

        subject.notifyAllObserver();

    }
}

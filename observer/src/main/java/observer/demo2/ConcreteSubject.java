package observer.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cuishifeng
 * @date 2018-12-08
 */
public class ConcreteSubject implements Subject {

    List<Observer> list;

    public ConcreteSubject() {
        this.list = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.list.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        list.stream().forEach(o -> {
            o.notify("hello notify");
        });
    }
}

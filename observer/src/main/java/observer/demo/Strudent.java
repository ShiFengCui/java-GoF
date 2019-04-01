package observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 学生 - 具体观察目标
 * @author cuishifeng
 * @Title: Strudent
 * @ProjectName observer.demo
 * @date 2018-11-10
 */
public class Strudent implements Subject {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

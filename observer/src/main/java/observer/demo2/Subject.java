package observer.demo2;

/**
 * @author cuishifeng
 * @date 2018-12-08
 */

public interface Subject {


    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyAllObserver();
}

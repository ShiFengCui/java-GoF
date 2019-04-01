package observer.demo;

/**
 * 抽象观察目标
 *
 * @author cuishifeng
 * @Title: Subject
 * @ProjectName observer.demo
 * @date 2018-11-10
 */
public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notify(String message);
}



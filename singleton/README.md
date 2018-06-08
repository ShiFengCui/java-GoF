
## 单例模式

单例模式保证整个系统只存在一个自己生产的实例，适用于频繁调用且可以共享的对象，例如日志对象，线程池等。

特点：

1. 构造器是私有的
2. 类的实例化由本身自己完成
3. 提供静态方法给外部调用返回唯一实例


## 饿汉模式


```
/**
 * @author cuishifeng
 * @create 2018-06-06
 **/
public class SingletonHungry {

    /**
     * 饿汉模式
     */
     
    private static SingletonHungry singletonHungry = new SingletonHungry();

    private SingletonHungry(){ }

    public static SingletonHungry getInstance(){
        return singletonHungry;
    }
}
```

饿汉模式的单例模式也是最常用的一种，类加载时候就完成了初始化，天生的线程安全

缺点：导致类加载变慢，用不用都会占用系统资源


## 懒汉模式


```
/**
 * @author cuishifeng
 * @create 2018-06-06
 **/
public class SingletonLazy {

    /**
     * 懒汉模式
     */
    private static SingletonLazy singleton = null;

    private SingletonLazy(){}

    public static SingletonLazy getInstance(){

        if (singleton == null){
            singleton = new SingletonLazy();
        }
        return singleton;
    }

}
```

原始的懒汉模式线程不安全，调用时实例化，不浪费内存资源

#### 懒汉-方法加锁


```java
public class SingletonLazyTwo {

    /**
     * 懒汉模式 - 线程安全 - 方法上加同步
     */
    private static SingletonLazyTwo singletonLazyTwo = null;

    private SingletonLazyTwo(){}

    public static synchronized SingletonLazyTwo getInstance(){
        if (singletonLazyTwo == null){
            singletonLazyTwo = new SingletonLazyTwo();
        }
        return singletonLazyTwo;
    }
}
```

方法加锁的懒汉模式实现了线程安全，但是多线程调用会造成排队，效率有点低


#### 懒汉-双重校验锁


```java
public class SingletonLazyThree {

    /**
     * 懒汉模式 - 线程安全 - 双重锁校验
     */
    private static SingletonLazyThree singletonLazyThree = null;

    private SingletonLazyThree(){}

    public static SingletonLazyThree getInstance(){

        if (singletonLazyThree == null){

            synchronized (SingletonLazyThree.class){
                if (singletonLazyThree == null){
                    singletonLazyThree = new SingletonLazyThree();
                }
            }
        }
        return singletonLazyThree;
    }
}


```

双重校验锁的懒汉模式不仅仅实现了线程安全,避免每个线程都要等待锁，要比在方法上加锁好一些，
初始化时懒加载，也比较容易实现



#### 懒汉-内部静态类


```java

public class SingletonLazyFour {

    /**
     * 懒汉模式 - 线程安全 - 静态内部类
     */

    private SingletonLazyFour(){}

    private static class LazyLoad{
        public static final SingletonLazyFour SINGLETON_LAZY_FOUR = new SingletonLazyFour();
    }

    public static final SingletonLazyFour getInstance(){
        return LazyLoad.SINGLETON_LAZY_FOUR;
    }
}

```
 
 内部静态类的懒汉模式即实现了线程安全和懒加载，又避免了同步带来的性能影响。
 
 ## 枚举
 
 
```java

/**
 * @author cuishifeng
 * @create 2018-06-07
 **/
public enum SingletonEnum {

    INSTANCE;

    public void test(){
        System.out.println("枚举单例模式");
    }
}

```

这种方式是实现单例模式的最佳方法；

它更简洁，自动支持序列化机制，绝对防止多次实例化。
这种方式是 Effective Java 作者 Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化

 
 
 
 
 



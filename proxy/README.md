### 代理模式

🐛特征：是代理类与委托类有同样的接口

🎨功能：代理类主要负责为委托类预处理消息、过滤消息、把消息转发给委托类，以及事后处理消息等。




### 静态代理

为特定被代理类写特定的代理类，通过调用代理类来调用被代理类的方法，为其实现特定功能，这种模式比较固定，不易扩展

> 写一个汽车接口和一个顾客去买车实现汽车类，顾客是被代理类，汽车接口是和代理类拥有共同接口，代理类为顾客买车增加买车过程和买车结束后的描述。

> Car (接口)

```java
/**
 * Created by cuishifeng on 2018/5/29.
 */
public interface Car {

    public void buyCar();
}
```
> Customer (被代理类)

```
/**
 * Created by cuishifeng on 2018/5/29.
 */
public class Customer implements Car {


    @Override
    public void buyCar() {
        System.out.println("买一辆法拉利！");
    }
}
```
> ProxyStatic (静态代理类)


```java
/**
 * Created by cuishifeng on 2018/5/29.
 */
public class ProxyStatic {

    Car car = new Customer();

    public void buyCar(){
        System.out.println("+++++++++++++++ 来到4S店看车付钱 +++++++++++++++");
        car.buyCar();
        System.out.println("+++++++++++++++ 开着法拉利回家 +++++++++++++++");
    }
}
```

> 客户端调用


```
/**
 * Created by cuishifeng on 2018/5/29.
 */
public class MainTest {

    public static void main(String[] args) {

        ProxyStatic proxy = new ProxyStatic();
        proxy.buyCar();
        
/** 输出*/
//        +++++++++++++++ 来到4S店看车付钱 +++++++++++++++
//                  买一辆法拉利！
//        +++++++++++++++ 开着法拉利回家 +++++++++++++++
    }
}
```



### 动态代理

1. 动态代理模式通过使用反射，可以在运行期决定加载哪个类，避免了一个类对应一个代理的问题
2. 通过统一的invoke方法，统一了代理类对原函数的处理过程，使用动态代理很大程度上减少了重复的代码，降低了维护的复杂性和成本。

> 继续沿用前面的场景，不过这次顾客可能有更多的意向，可能买车，也可能卖车，也可能只是去看看车，如果使用静态代理需要对每个意向写一个代理


```java
/**
 * Created by cuishifeng on 2018/5/29.
 */
public interface Car {

    public void buyCar();

    public void sellCar();

    public void seeCar();
}
```


```java
/**
 * Created by cuishifeng on 2018/5/29.
 */
public class Customer implements Car {

    @Override
    public void buyCar() {
        System.out.println("我要买一辆法拉利！");
    }

    @Override
    public void sellCar() {
        System.out.println("我要卖一辆兰博基尼！");
    }

    @Override
    public void seeCar() {
        System.out.println("我要去4S店去看看车！");
    }
}
```
> 动态代理类


```
/**
 * Created by cuishifeng on 2018/5/29.
 */
public class ProxyHandler implements InvocationHandler {

    public Object obj;

    public Object DynamicAent(Object obj){
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("+++++++++ 动态代理 start +++++++++++");
        method.invoke(obj,args);
        System.out.println("+++++++++ 动态代理 end +++++++++++");
        return null;
    }
}
```
> 客户端调用


```
/**
 * Created by cuishifeng on 2018/5/29.
 */
public class Test {

    public static void main(String[] args) {

        ProxyHandler proxy = new ProxyHandler();

        Car car = (Car) proxy.DynamicAent(new Customer());
        car.buyCar();
        System.out.println("---------------------------------");
        car.sellCar();
        System.out.println("---------------------------------");
        car.seeCar();

/** 打印结果 */
//        +++++++++ 动态代理 start +++++++++++
//                我要买一辆法拉利！
//        +++++++++ 动态代理 end +++++++++++
//       ---------------------------------
//        +++++++++ 动态代理 start +++++++++++
//                我要卖一辆兰博基尼！
//        +++++++++ 动态代理 end +++++++++++
//        ---------------------------------
//        +++++++++ 动态代理 start +++++++++++
//                我要去4S店去看看车！
//        +++++++++ 动态代理 end +++++++++++

    }
}
```



### 动态代理和静态代理的区别
🍲
静态代理模式在代码运行前，代理类的class编译文件就已经存在了，也就是说我们在编码阶段就已经知道要代理谁了。

🍤
动态代理模式则相反，它是根据反射来生成代理类的对象，我们在编码阶段根本不需要知道要代理谁，代理谁会在执行阶段决定。


### 动态代理升级

> 当我们只有声明被代理类与代理类的共同接口方法，并且有多个接口和实现，利用反射的方法获取被代理类，并委托代理类调用被代理类实现的接口的方法

> 💡汽车接口

```java
/**
 * Created by cuishifeng on 2018/5/30.
 */
public interface Car {

    public void buyCar();
}
```
> 顾客

```java
/**
 * Created by cuishifeng on 2018/5/30.
 */
public class Customer implements Car {

    @Override
    public void buyCar() {
        System.out.println("顾客去购买一辆法拉利！");
    }
}
```

> 车商


```java
/**
 * Created by cuishifeng on 2018/5/30.
 */
public class Dealer implements Car{

    @Override
    public void buyCar() {
        System.out.println("车商要去批量收购一批车！");
    }
}
```

> 💻 食物接口


```java
/**
 * Created by cuishifeng on 2018/5/30.
 */
public interface Food {

    public void foodType();
}
```

> 苹果


```java
/**
 * Created by cuishifeng on 2018/5/30.
 */
public class Apple implements Food {

    @Override
    public void foodType() {
        System.out.println("我是一个苹果！");
    }
}
```

> 香蕉


```java
/**
 * Created by cuishifeng on 2018/5/30.
 */
public class Banana implements Food {

    @Override
    public void foodType() {
        System.out.println("我是一个香蕉！");
    }
}
```

> 🎨 代理类(利用反射生成被代理类)


```java
/**
 * Created by cuishifeng on 2018/5/30.
 */
public class ProxyHandler implements InvocationHandler{

    private Object obj;

    public Object DynamicAent(String className){
        Class clazz = reflect(className);
        try {
            this.obj = (Object)clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Class reflect(String className){
        Class clazz = null;
        try {
            clazz =  Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return clazz;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("++++++++++++ 动态代理 start");
        Object ret = method.invoke(obj,args);
        System.out.println("++++++++++++ 动态代理 end");
        return ret;
    }
}
```

🍝 客户端调用 - 这时候调用我们只需要获取被代理类的全路径名通过反射生成被代理类。


```java
/**
 * Created by cuishifeng on 2018/5/30.
 */
public class Test {

    public static void main(String[] args) {

        ProxyHandler proxy = new ProxyHandler();

        Car customer = (Car)proxy.DynamicAent("com.cuishifeng.learn.advance.Customer");
        customer.buyCar();
//        ++++++++++++ 动态代理 start
//        顾客去购买一辆法拉利！
//        ++++++++++++ 动态代理 end

        Car dealer = (Car)proxy.DynamicAent("com.cuishifeng.learn.advance.Dealer");
        dealer.buyCar();

//        ++++++++++++ 动态代理 start
//        车商要去批量收购一批车！
//        ++++++++++++ 动态代理 end

        Food apple = (Food)proxy.DynamicAent("com.cuishifeng.learn.advance.Apple");
        apple.foodType();

//        ++++++++++++ 动态代理 start
//        我是一个苹果！
//        ++++++++++++ 动态代理 end

        Food banana = (Food)proxy.DynamicAent("com.cuishifeng.learn.advance.Banana");
        banana.foodType();

//        ++++++++++++ 动态代理 start
//        我是一个香蕉！
//        ++++++++++++ 动态代理 end
    }
}
```


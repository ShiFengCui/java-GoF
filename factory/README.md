


### 工厂方法模式

> #### 概要

1. 一个抽象产品类
2. 多个具体产品类
3. 一个抽象工厂
4. 多个具体工厂 - 每一个具体产品对应一个具体工厂
5. 符合 - [OCP开放封闭原则](https://blog.csdn.net/yabay2208/article/details/73927991)

![image](http://images.cnblogs.com/cnblogs_com/NiceCui/1126956/o_%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F.png)

#### 优点

1. 降低了代码耦合度，对象的生成交给子类去完成
2. 实现了开放封闭原则 - 每次添加子产品 不需要修改原有代码

#### 缺点

1. 增加了代码量，每个具体产品都需要一个具体工厂
2. 当增加抽象产品 也就是添加一个其他产品族 需要修改工厂 违背OCP


#### 代码角度进一步解读

> 抽象产品类

```java
/**
 * @author cuishifeng
 * @create 2018-08-02
 **/
public interface Computer {

    /**
     * 生产电脑
     */
    void createComputer();
}

```

> 具体产品

```java
/**
 * @author cuishifeng
 * @create 2018-08-02
 **/
public class Cpu implements Computer {

    @Override
    public void createComputer() {
        System.out.println("生产cpu");
    }
}

```

```java
/**
 * @author cuishifeng
 * @create 2018-08-02
 **/
public class Disk implements Computer {

    @Override
    public void createComputer() {
        System.out.println("生产磁盘disk");
    }
}

```

```java
/**
 * @author cuishifeng
 * @create 2018-08-02
 **/
public class Displayer implements Computer {
    @Override
    public void createComputer() {
        System.out.println("生产显卡displayer");
    }
}
```
> 抽象工厂类

```java
/**
 * @author cuishifeng
 * @create 2018-08-02
 **/
public interface ComputerFactory {

    /**
     * 工厂方法模式的抽象工厂
     * @return
     */
     Computer getProduct();
}

```
> 具体工厂

```java
/**
 * @author cuishifeng
 * @create 2018-08-02
 **/
public class CpuFactory implements ComputerFactory {

    @Override
    public Computer getProduct() {
        return new Cpu();
    }
}
```

```java
/**
 * @author cuishifeng
 * @create 2018-08-02
 **/
public class DiskFactory implements ComputerFactory{
    @Override
    public Computer getProduct() {
        return new Disk();
    }
}
```

```java
/**
 * @author cuishifeng
 * @create 2018-08-02
 **/
public class DisplayerFactory implements ComputerFactory {
    @Override
    public Computer getProduct() {
        return new Displayer();
    }
}
```

```java
/**
 * 客户端
 * @author cuishifeng
 * @create 2018-08-02
 **/
public class AppClient {

    public static void main(String[] args) {
        ComputerFactory computerFactory = new CpuFactory();
        computerFactory.getProduct().createComputer();

        System.out.println("---------------------------- ");

        computerFactory = new DiskFactory();
        computerFactory.getProduct().createComputer();

        System.out.println("---------------------------- ");

        computerFactory = new DisplayerFactory();
        computerFactory.getProduct().createComputer();

    }
}
```
> 打印结果

```java
生产cpu
---------------------------- 
生产磁盘disk
---------------------------- 
生产显卡displayer

Process finished with exit code 0
```

### 抽象工厂模式

> #### 概要

1. 多个抽象产品类
2. 具体产品类 
3. 抽象工厂类 - 声明(一组)返回抽象产品的方法
4. 具体工厂类 - 生成(一组)具体产品

![image](https://mmbiz.qpic.cn/mmbiz_jpg/dkwuWwLoRK9GAENib1jwY4stIStb2jtyeAvQHxEQxGVcXfF2yY0sRRnlsjzL2icDG1AgJEhVuObuSicyMFiaWmgZag/640?wx_fmt=jpeg&tp=webp&wxfrom=5&wx_lazy=1)

#### 优点

1. 代码解耦
2. 实现多个产品族(相关联产品组成的家族)，而工厂方法模式的单个产品,可以满足更多的生产需求
3. 很好的满足OCP开放封闭原则
4. 抽象工厂模式中我们可以定义实现不止一个接口，一个工厂也可以生成不止一个产品类 对于复杂对象的生产相当灵活易扩展

#### 缺点

1.扩展产品族相当麻烦 而且扩展产品族会违反OCP,因为要修改所有的工厂，例如我们有电脑和鼠标组成的一个产品族，我们写完代码再去添加一个键盘就会很麻烦，看完下面代码就会理解了

2.由于抽象工厂模式是工厂方法模式的扩展 总体的来说 很笨重


#### 代码角度进一步解读

> 抽象产品


```java
/**
 * 计算机-抽象产品类
 * @author cuishifeng
 * @create 2018-08-02
 **/
public abstract class Computer {

    /**
     * 生产计算机
     */
    public abstract void productComputer();
}
```

```java
/**
 * 鼠标 - 抽象产品类
 * @author cuishifeng
 * @create 2018-08-02
 **/
public abstract class Mouse {

    /**
     * 生产鼠标
     */
    public abstract void productMouse();
}
```
> 具体产品

[电脑的具体产品](https://github.com/ShiFengCui)


```java
/**
 * PC计算机具体产品类
 * @author cuishifeng
 * @create 2018-08-02
 **/
public class PcComputer extends Computer {

    @Override
    public void productComputer() {
        System.out.println("PC端计算机");
    }
}
```

```java
/**
 * @author cuishifeng
 * @create 2018-08-02
 **/
public class ServerComputer extends Computer {

    @Override
    public void productComputer() {
        System.out.println("Server端计算机");
    }
}
```
[鼠标具体产品](https://github.com/ShiFengCui)

```java
/**
 * @author cuishifeng
 * @create 2018-08-02
 **/
public class GameMouse extends Mouse {

    @Override
    public void productMouse() {
        System.out.println("游戏鼠标");
    }
}
```

```java
/**
 * @author cuishifeng
 * @create 2018-08-02
 **/
public class OfficeMouse extends Mouse {

    @Override
    public void productMouse() {
        System.out.println("办公鼠标");
    }
}
```


> 抽象工厂

```java
/**
 * @author cuishifeng
 * @create 2018-08-02
 **/
public interface IFactory {

    /**
     * 获取计算机
     * @return
     */
    Computer getComputer();

    /**
     * 获取鼠标
     * @return
     */
    Mouse getMouse();

}

```
[产品A具体工厂](https://github.com/ShiFengCui)

```java
/**
 * @author cuishifeng
 * @create 2018-08-02
 **/
public class ProductFactoryA implements IFactory {

    @Override
    public Computer getComputer() {
        return new PcComputer();
    }

    @Override
    public Mouse getMouse() {
        return new OfficeMouse();
    }
}
```

[产品B具体工厂](https://github.com/ShiFengCui)

```java
/**
 * @author cuishifeng
 * @create 2018-08-02
 **/
public class ProductFactoryB implements IFactory {
    @Override
    public Computer getComputer() {
        return new ServerComputer();
    }

    @Override
    public Mouse getMouse() {
        return new GameMouse();
    }
}
```

### 简单工厂

> #### 概要

1. 一个抽象产品类
2. 具体产品类
3. 一个工厂

#### 优点

1. 简单易于实现
2. 把类的实例化交给工厂,易于解耦

#### 缺点

1.添加具体产品需要修改工厂 违反OCP开放封闭原则

#### 代码角度进一步解读

> 抽象产品类


```java
/**
 * @author cuishifeng
 * @create 2018-07-09
 **/
public interface Car {

    /**
     * 我有一辆什么车
     */
     void myCar();
}

```

> 具体产品



```java
/**
 * @author cuishifeng
 * @create 2018-07-09
 **/

public class BenChiCar implements Car {


    @Override
    public void myCar() {
        System.out.println("我有一辆奔驰车！");
    }
}
```



```java
public class FerrariCar implements Car {

    @Override
    public void myCar() {
        System.out.println("我有一辆法拉利！");
    }
}
```

```java
public class LamborghiniCar implements Car {
    @Override
    public void myCar() {
        System.out.println("我有一辆兰博基尼！");
    }
}
```
> 工厂类

```java
public class CarFactory {

    public static Car createCar(String carName){
        if (carName == null){
            return null;
        }
        switch (carName){
            case "BenChiCar":
                return new BenChiCar();
            case "FerrariCar":
                return new FerrariCar();
            case "LamborghiniCar":
                return new LamborghiniCar();
            default:
                return null;
        }
    }
}
```

```java
Car car = CarFactory.createCar("BenChiCar");
car.myCar();

Car car2 = CarFactory.createCar("FerrariCar");
car2.myCar();

输出

我有一辆奔驰车！
我有一辆法拉利！
```

### 总结

简单工厂模式最大的有点就是工厂内有具体的逻辑去判断生成什么产品，将类的实例化交给了工厂，这样当我们需要什么产品只需要修改客户端的调用而不需要去修改工厂，对于客户端来说降低了与具体产品的依赖


工厂方法模式是简单工厂的扩展，工厂方法模式把原先简单工厂中的实现那个类的逻辑判断交给了客户端，如果像添加功能只需要修改客户和添加具体的功能，不用去修改之前的类。

抽象工厂模式进一步扩展了工厂方法模式，它把原先的工厂方法模式中只能有一个抽象产品不能添加产品族的缺点克服了，抽象工厂模式不仅仅遵循了OCP原则(对扩展开放，对修改关闭)，而且可以添加更多产品(抽象产品),具体工厂也不仅仅可以生成单一产品，而是生成一组产品，抽象工厂也是声明一组产品，对应扩展更加灵活，但是要是扩展族系就会很笨重。
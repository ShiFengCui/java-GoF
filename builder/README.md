## 建造者模式

✅   建造者模式用于构建复杂的不可变的对象

> 其实上面这句话就是建造者模式的灵魂，复杂的对象，例如拥有很多成员变量的类，我们假设让它不可变，我们需要声明变量属性是final的，并且我们需要用多个构造函数去设置这些变量值，例如


```java
/**
 * Created by cuishifeng on 2018/5/31.
 */
public class Food {

    private final String  apple;
    private final String  banana;
    private final String pear;
    private final String grape;


    public Food(String apple){
        this(apple,"");
    }

    public Food(String apple,String  banana){
        this(apple,banana,"");
    }

    public Food(String apple,String  banana,String pear){
       this(apple,banana,pear,"");
    }

    public Food(String apple,String  banana,String pear,String grape){
        this.apple =apple;
        this.banana = banana;
        this.pear = pear;
        this.grape = grape;
    }
}    
```

建立一个只需要所需属性作为参数的构造函数，为类的成员变量赋值，这样可以创建一个不可变类，但是对于成员变量很多的时候，这样的劣势就会凸显，我们需要建立各种各样的构造函数去满足需求。

### 用getter、setter

> 我们遵循javaBeans约定，有一个无参构造函数，每个成员变量都有对应的getter和setter方法


```java
/**
 * Created by cuishifeng on 2018/5/31.
 */
public class Food2 {

    private  String  apple;
    private  String  banana;
    private  String pear;
    private  String grape;

    public String getApple() {
        return apple;
    }

    public void setApple(String apple) {
        this.apple = apple;
    }

    public String getBanana() {
        return banana;
    }

    public void setBanana(String banana) {
        this.banana = banana;
    }

    public String getPear() {
        return pear;
    }

    public void setPear(String pear) {
        this.pear = pear;
    }

    public String getGrape() {
        return grape;
    }
}
```

使用这种方式对象是一直都处于可变状态，无论我们实例化对象后任何时候调用setter方法都可以改变这个对象

### 用建造者模式

![建造者模式](http://images.cnblogs.com/cnblogs_com/NiceCui/1126956/o_TIM%E5%9B%BE%E7%89%8720180531145620.png)

💡 产品 💻 建造者  

这两个是必须的，建造者抽象接口和指挥者都是可以省略的。

> 我们按照最详细的建造者模式去生产一辆小汽车，小汽车组成定义为 底盘、方向盘、车胎这三部分，我们为其打造一个建造者

🎨 产品 

```java
/**
 * Created by cuishifeng on 2018/5/30.
 */
public class Car {

    // 汽车底盘
    private String chassis;
    // 汽车轮胎
    private String steering;
    // 汽车座椅
    private String seat;

    public String getChassis() {
        return chassis;
    }

    public String getSteering() {
        return steering;
    }

    public String getSeat() {
        return seat;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

}
```
🎨 建造者抽象接口


```java
/**
 * Created by cuishifeng on 2018/5/30.
 */
public abstract class Builder {

    public abstract void buildChassis(String chassis);

    public abstract void buildSeat(String seat);

    public abstract void buildSteering(String steering);

    public abstract Car create();
}
```

🎨 实际的汽车建造者


```java
/**
 * Created by cuishifeng on 2018/5/30.
 */
public class CarBuilder extends Builder {

    private Car car = new Car();

    public void buildChassis(String chassis) {
            car.setChassis(chassis);
    }

    public void buildSeat(String seat) {
            car.setSeat(seat);
    }

    public void buildSteering(String steering) {
            car.setSteering(steering);
    }

    public Car create() {
        return this.car;
    }
}

```
🎨 指挥者


```java
/**
 * Created by cuishifeng on 2018/5/30.
 */
public class Director {

    Builder builder = null;

    public Director(Builder builder){
        this.builder = builder;
    }
    public Car createCar(String chassis,String seat,String steering){
        builder.buildChassis(chassis);
        builder.buildSeat(seat);
        builder.buildSteering(steering);
        return builder.create();
    }
}

```
开始建造汽车

```java
/**
 * Created by cuishifeng on 2018/5/30.
 */
public class Test {

    public static void main(String[] args) {
        Builder builder = new CarBuilder();
        Director director = new Director(builder);

        Car car1 = director.createCar("德国汽车底盘","发过进口座椅","中国轮胎");
        System.out.println(car1.toString());

        // 如果不使用指挥者

        builder.buildSteering("中国轮胎");
        builder.buildSeat("中国座椅");
        builder.buildChassis("中国底盘");
        Car car2 = builder.create();
        System.out.println(car2.toString());
    }

}

```

### 建造者和产品

✅   使用建造者模式我们绝大部分会是这样去使用，将建造者定义为内部静态类

```java
/**
 * Created by cuishifeng on 2018/5/30.
 */
public class User {
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }


    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}
```


```java
/**
 * Created by cuishifeng on 2018/5/30.
 */
public class Test {

    public static void main(String[] args) {
        User user = new User.UserBuilder("Jhon", "Doe")
                .address("北京")
                .age(20)
//                .phone("123456")
                .build();

        User user2 = new User.UserBuilder("Jhon", "Doe")
                .address("北京")
                .age(20)
                .phone("123456")
                .build();
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
    }
}
```
- 🐛 构造器是私有的，无法直接实例化对象
- 💻  对象一旦构造完成，对象是不可变的，我们只提供了getter方法
- 🐛 更易于阅读，编写和维护的客户端代码。此外，您的类可以保持不变，这使您的代码更安全。

### 建造者模式使用模板类

我们可以为产品制定一个额外的固定的可以重复使用的模板，例如我们orm框架自定义查询中每个自定义查询都要用到 分页、页面大小、排序等等，我们还有好多想法可以融入到模板中去，这一次，我们还是去组装汽车，然后我们每一次装订汽车可能需要到的工具和说明总结。

> 产品模板类


```java
/**
 * Created by cuishifeng on 2018/5/30.
 */
public class CustomeTemplate {

    protected String tool;

    protected String log;

    public String getTool() {
        return tool;
    }

    public String getLog() {
        return log;
    }

}

```

> 建造者模板类


```java

/**
 * Created by cuishifeng on 2018/5/30.
 */
public class CustomeBuilderTemplate <T extends CustomeTemplate> {

    protected T object;
    protected CustomeBuilderTemplate(T object){
        this.object = object;
        this.object.tool = object.tool;
        this.object.log = object.log;
    }

    public CustomeBuilderTemplate<T> setTool(String tool){
        if (!Objects.isNull(tool) && !"".equals(tool)){
            this.object.tool = tool;
        }
        return this;
    }

    public CustomeBuilderTemplate<T> setLog(String log){
        if (!Objects.isNull(log) && !"".equals(log)){
            this.object.log = log;
        }
        return this;
    }

    public T build(){
        return object;
    }
}
```



```java
/**
 * Created by cuishifeng on 2018/5/30.
 */
public class Car extends CustomeTemplate{

    private String brand;

    private String steering;

    private String color;

    public String getBrand() {
        return brand;
    }

    public String getSteering() {
        return steering;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "tool='" + tool + '\'' +
                ", log='" + log + '\'' +
                ", brand='" + brand + '\'' +
                ", steering='" + steering + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static class CarBuilder extends CustomeBuilderTemplate<Car>{
        private CarBuilder(){
            super(new Car());
        }

        public static CarBuilder builder(){
            return new CarBuilder();
        }

        public CarBuilder setBrand(String brand){
            if(Objects.nonNull(brand) && !"".equals(brand)){
                this.object.brand = brand;
            }
            return this;
        }

        public CarBuilder setSteering(String steering){
            if(Objects.nonNull(steering) && !"".equals(steering)){
                this.object.steering = steering;
            }
            return this;
        }

        public CarBuilder setColor(String color){
            if(Objects.nonNull(color) && !"".equals(color)){
                this.object.color = color;
            }
            return this;
        }
    }
}
```
这样的建造这模式会功能更加强大


```java
/**
 * Created by cuishifeng on 2018/5/30.
 */
public class CarTest {

    public static void main(String[] args) {

        Car car = Car.CarBuilder.builder()
                .setBrand("奔驰")
                .setSteering("4座")
                .setColor("黑色")
                .setLog("记录生活日志")
                .setTool("此次使用的是建造者模式")
                .build();

        System.out.println(car.toString());

    }
}
```

一旦完成建造，调用build方法 这个对象就不可变了。












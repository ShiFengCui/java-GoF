package test;

/**
 * @author cuishifeng
 * @Title: CarBenChi
 * @ProjectName test
 * @date 2018-11-13
 */
public abstract class Car {

    public Car() {
        System.out.println("实例化父类 Car");
    }

    static class CarBenChi extends Car {

        public CarBenChi() {
            System.out.println("实例化子类 CarBenChi");
        }

    }

    public static void main(String[] args) {

        Car car = new CarBenChi();

//  打印输出：
//        实例化父类 Car
//        实例化子类 CarBenChi
    }
}


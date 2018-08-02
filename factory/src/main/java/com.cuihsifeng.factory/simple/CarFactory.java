package com.cuihsifeng.factory.simple;

/**
 * @author cuishifeng
 * @create 2018-07-09
 **/

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

//    public static Car productCar(String carName){
//        if (carName == null){
//            return null;
//        }
//        if (("BenChiCar").equalsIgnoreCase(carName)){
//            return new BenChiCar();
//        }else if (("FerrariCar").equalsIgnoreCase(carName)){
//            return new FerrariCar();
//        }else if (("LamborghiniCar").equalsIgnoreCase(carName)){
//            return new LamborghiniCar();
//        }
//        return null;
//    }
}

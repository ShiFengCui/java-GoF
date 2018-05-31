package com.cuishifeng.learn.advance;

import java.util.Objects;

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

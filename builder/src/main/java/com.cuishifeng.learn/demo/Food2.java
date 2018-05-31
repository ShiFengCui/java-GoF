package com.cuishifeng.learn.demo;

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

    public void setGrape(String grape) {
        this.grape = grape;
    }

    @Override
    public String toString() {
        return "Food2{" +
                "apple='" + apple + '\'' +
                ", banana='" + banana + '\'' +
                ", pear='" + pear + '\'' +
                ", grape='" + grape + '\'' +
                '}';
    }
}

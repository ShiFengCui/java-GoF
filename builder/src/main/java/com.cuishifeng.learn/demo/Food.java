package com.cuishifeng.learn.demo;

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

    @Override
    public String toString() {
        return "Food{" +
                "apple='" + apple + '\'' +
                ", banana='" + banana + '\'' +
                ", pear='" + pear + '\'' +
                ", grape='" + grape + '\'' +
                '}';
    }


}

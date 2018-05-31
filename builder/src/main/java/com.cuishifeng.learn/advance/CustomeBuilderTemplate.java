package com.cuishifeng.learn.advance;


import java.util.Objects;

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

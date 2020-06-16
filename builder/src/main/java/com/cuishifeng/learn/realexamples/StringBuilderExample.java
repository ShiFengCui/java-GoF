package com.cuishifeng.learn.realexamples;

import java.nio.ByteBuffer;

import org.junit.Test;

/**
 * @author cuishifeng
 * Created on 2020-06-15
 */
public class StringBuilderExample {


    @Test
    public void test1() throws Exception {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hello");


        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
    }

}

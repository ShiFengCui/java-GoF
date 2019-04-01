package com.cuishifeng.designmode.demo;

/**
 * @author cuishifeng
 * @date 2018-12-19
 */
public class ReadListener implements Listener {

    @Override
    public void isReading(Event event) {
        HttpReader read = (HttpReader) event;
        System.out.println(read.getName() + "监听到正在阅读");
    }
}

package com.cuishifeng.designmode.demo;

/**
 * @author cuishifeng
 * @date 2018-12-19
 */
public class HttpReader extends Event {


    private Listener listener;
    private String name = "小米";

    public HttpReader() {
        setListener(new ReadListener());
    }

    private void setListener(Listener listener) {
        this.listener = listener;
    }

    public void read() {
        System.out.println("开始阅读");
        if (listener != null) {
            listener.isReading(this);
        }
    }

    public String getName() {
        return name;
    }
}

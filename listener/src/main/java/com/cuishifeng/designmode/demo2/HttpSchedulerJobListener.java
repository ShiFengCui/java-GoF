package com.cuishifeng.designmode.demo2;

/**
 * @author cuishifeng
 * @date 2018-12-19
 */
public class HttpSchedulerJobListener implements Listener {


    @Override
    public void receiveEvent(Event event) throws Exception {
        ApplicationHttpJobReader httpJobReader = (ApplicationHttpJobReader) event;
        System.out.println("http监听器收到: " + httpJobReader.getSource().toString());
    }
}

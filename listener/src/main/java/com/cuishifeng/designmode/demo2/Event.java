package com.cuishifeng.designmode.demo2;

/**
 * @author cuishifeng
 * @date 2018-12-19
 */
public interface Event {

    /**
     * 添加观察对象
     *
     * @param listener
     * @throws Exception
     */
    void addListener(Listener listener) throws Exception;


    /**
     * 删除观察对象
     *
     * @param listener
     * @throws Exception
     */
    void remove(Listener listener) throws Exception;


    /**
     * 通知观察对象
     *
     * @throws Exception
     */
    void notifyListener() throws Exception;
}

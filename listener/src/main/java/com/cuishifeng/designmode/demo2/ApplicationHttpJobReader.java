package com.cuishifeng.designmode.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cuishifeng
 * @date 2018-12-19
 */
public class ApplicationHttpJobReader implements Event {

    private List<Listener> listeners = new ArrayList<Listener>();

    private Object source;


    public ApplicationHttpJobReader(Object source) {
        this.source = source;
        try {
            addListener(new HttpSchedulerJobListener());
            notifyListener();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object getSource() {
        return source;
    }

    @Override
    public void addListener(Listener listener) throws Exception {
        listeners.add(listener);
    }

    @Override
    public void remove(Listener listener) throws Exception {
        if (listeners != null) {
            listeners.remove(listener);
        }
    }

    @Override
    public void notifyListener() throws Exception {
        if (listeners != null && !listeners.isEmpty()) {
            for (Listener listener : listeners) {
                listener.receiveEvent(this);
            }
        }
    }
}

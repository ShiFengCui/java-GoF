package com.cuishifeng.learn.adapter.classStructure;

/**
 * @author cuishifeng
 * @Title: FormartAdapter
 * @ProjectName com.cuishifeng.learn.adapter.classStructure
 * @date 2018-10-25
 */
public class FormartAdapter extends Mp4PlayerAdaptor implements DvdPlayer {

    @Override
    public void playMovie() {
        playMp4Movie();
    }
}

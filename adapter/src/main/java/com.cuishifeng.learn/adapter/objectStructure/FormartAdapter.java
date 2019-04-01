package com.cuishifeng.learn.adapter.objectStructure;


/**
 * @author cuishifeng
 * @Title: FormartAdapter
 * @ProjectName com.cuishifeng.learn.adapter.classStructure
 * @date 2018-10-25
 */
public class FormartAdapter implements DvdPlayer {

    Mp4PlayerAdaptor mp4PlayerAdaptor;

    public FormartAdapter() {
        mp4PlayerAdaptor = new Mp4PlayerAdaptor();
    }

    @Override
    public void playMovie() {
        mp4PlayerAdaptor.playMp4Movie();
    }
}

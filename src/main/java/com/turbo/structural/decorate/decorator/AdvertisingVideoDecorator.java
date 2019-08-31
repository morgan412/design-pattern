package com.turbo.structural.decorate.decorator;

import com.turbo.structural.decorate.component.Video;

/**
 * 具体的修饰类
 * @author zouxq
 */
public class AdvertisingVideoDecorator extends BaseVideoDecorator {

    // 定义被修饰者
    public AdvertisingVideoDecorator(Video video) {
        super(video);
    }

    @Override
    public void play() {
        addaAdvertising();
        super.play();
    }

    // 定义修饰的方法
    private void addaAdvertising(){
        System.out.println("来看个广告，充钱可以不用看哦");
    }

}

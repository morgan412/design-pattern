package com.turbo.structural.decorate.decorator;

import com.turbo.structural.decorate.component.Video;

/**
 * 抽象装饰类
 * @author zouxq
 */
public abstract class BaseVideoDecorator implements Video {

    private Video video;

    // 通过构造函数传递被修饰者
    public BaseVideoDecorator(Video video) {
        this.video = video;
    }

    // 委托给修饰者执行
    @Override
    public void play() {
        video.play();
    }
}

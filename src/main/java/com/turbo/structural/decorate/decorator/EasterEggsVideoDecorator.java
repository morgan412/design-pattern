package com.turbo.structural.decorate.decorator;

import com.turbo.structural.decorate.component.Video;

/**
 * 具体的修饰类
 * @author zouxq
 */
public class EasterEggsVideoDecorator extends BaseVideoDecorator {

    // 定义被修饰者
    public EasterEggsVideoDecorator(Video video) {
        super(video);
    }

    @Override
    public void play() {
        super.play();
        addEggs();
    }

    // 定义修饰的方法
    private void addEggs(){
        System.out.println("加个彩蛋...");
    }

}

package com.turbo.structural.decorate.component;

/**
 * Movie  具体构件，被装饰的对象
 * @author zouxq
 */
public class Movie implements Video{

    @Override
    public void play() {
        System.out.println("看电影");
    }
}

package com.turbo.structural.decorate;

import com.turbo.structural.decorate.component.Movie;
import com.turbo.structural.decorate.component.Video;
import com.turbo.structural.decorate.decorator.AdvertisingVideoDecorator;
import com.turbo.structural.decorate.decorator.EasterEggsVideoDecorator;
import org.junit.Test;

/**
 * @author zouxq
 */
public class DecoratorDemo {

    @Test
    public void decoratorTest() {
        Video movie = new Movie();
        movie.play();
        System.out.println("第一次装饰......");
        movie = new AdvertisingVideoDecorator(movie);
        movie.play();
        System.out.println("第二次装饰......");
        movie = new EasterEggsVideoDecorator(movie);
        movie.play();
    }
}

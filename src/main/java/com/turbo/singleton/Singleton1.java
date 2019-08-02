package com.turbo.singleton;

/**
 * 饿汉式单例
 * @author zouxq
 */
public class Singleton1 {
    /**
     * 静态成员变量，在静态初始化时便实例化对象
     */
    private static Singleton1 singleton = new Singleton1();
    /**
     * 获取实例
     */
    private Singleton1(){
    }
    public static Singleton1 getSingletonInstance(){
        return singleton;
    }
}

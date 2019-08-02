package com.turbo.singleton;

/**
 * 静态内部类
 * @author zouxq
 */
public class Singleton5 {
    private Singleton5(){}

    // 获取实例
    public static Singleton5 getSingletonInstance(){
        return SingletonHolder.SINGLETON;
    }

    /**
     * 内部类，JVM在类加载的时候，是互斥的，可以保证线程安全
     */
    private static class SingletonHolder{
        private static final Singleton5 SINGLETON = new Singleton5();
    }
}

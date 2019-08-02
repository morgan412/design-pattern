package com.turbo.singleton;

/**
 * 懒汉式单例（非线程安全）
 * @author zouxq
 */
public class Singleton2 {
    private static Singleton2 singleton;
    private Singleton2(){}
    /**
     * 获取实例
     */
    public static Singleton2 getSingletonInstance(){
        if(singleton == null){
            singleton =  new Singleton2();
        }
        return singleton;
    }
}

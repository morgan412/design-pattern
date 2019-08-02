package com.turbo.singleton;

/**
 * 懒汉式单例（synchronized关键字线程安全）
 * @author zouxq
 */
public class Singleton3 {
    private static Singleton3 singleton;
    private Singleton3(){}

    /**
     * 获取实例
     */
    public static synchronized Singleton3 getSingletonInstance(){
        if(singleton == null){
            singleton =  new Singleton3();
        }
        return singleton;
    }
}

package com.turbo.singleton;

/**
 * 双重校验锁（double-checked locking，DCL）
 * @author zouxq
 */
public class Singleton4 {
    /**
     * 成员变量这里会加上关键字 volatile，目的是为了防止指令重排
     */
    private static volatile Singleton4 singleton;
    private Singleton4(){}
    // 获取实例
    public static Singleton4 getSingletonInstance(){
        // 第一次校验，没有实例化才进入同步代码块
        if(singleton == null){
            synchronized (Singleton4.class){
                // 进入同步代码块后，再判断，如果为空才创建实例
                if(singleton == null){
                    singleton =  new Singleton4();
                }
            }
        }
        return singleton;
    }
}

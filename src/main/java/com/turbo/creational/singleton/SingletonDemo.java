package com.turbo.creational.singleton;

import org.junit.Test;

/**
 * @author zouxq
 */
public class SingletonDemo {

    @Test
    public void test() {
        // 饿汉式
        System.out.println(Singleton1.getSingletonInstance());
        // 懒汉式(非线程安全)
        System.out.println(Singleton2.getSingletonInstance());
        // 懒汉式(synchronized)
        System.out.println(Singleton3.getSingletonInstance());
        // 懒汉式(双重校验锁，DCL)
        System.out.println(Singleton4.getSingletonInstance());
        // 懒汉式（静态内部类）
        System.out.println(Singleton5.getSingletonInstance());
        // 枚举方式
        System.out.println(Singleton6.SINGLETON);
    }
}

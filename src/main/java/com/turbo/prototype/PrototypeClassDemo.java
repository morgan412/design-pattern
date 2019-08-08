package com.turbo.prototype;

import org.junit.Test;

/**
 * 原型模式
 *
 * @author zouxq
 */
public class PrototypeClassDemo implements Cloneable {

    @Test
    public void test() throws CloneNotSupportedException {
        PrototypeClass p1 = new PrototypeClass();
        p1.setName("zhangsan");
        p1.getList().add("zhangsan");
        System.out.println("p1 " + p1.toString());

        PrototypeClass p2 = p1.clone();
        p2.setName("lisi");
        p2.getList().add("lisi");
        System.out.println("p2 " + p2.toString());
        System.out.println("p1 " + p1.toString());
    }
}

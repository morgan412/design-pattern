package com.turbo.prototype;

import org.junit.Test;

import java.io.IOException;

/**
 * 原型模式-序列化实现深复制
 *
 * @author zouxq
 */
public class PrototypeClassSerializeDemo {

    @Test
    public void test() throws IOException, ClassNotFoundException {
        PrototypeClassSerialize p1 = new PrototypeClassSerialize();
        p1.setName("zhangsan");
        p1.getList().add("zhangsan");
        System.out.println("p1 " + p1.toString());

        PrototypeClassSerialize p2 = (PrototypeClassSerialize) p1.deepClone();
        p2.setName("lisi");
        p2.getList().add("lisi");
        System.out.println("p2 " + p2.toString());
        System.out.println("p1 " + p1.toString());
    }
}

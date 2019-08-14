package com.turbo.creational.prototype;

import java.io.*;
import java.util.ArrayList;

/**
 * 原型模式-序列化实现深复制
 *
 * @author zouxq
 */
public class PrototypeClassSerialize implements Serializable {

    private String name;
    private ArrayList<String> list = new ArrayList<>();

    /**
     * 深复制 需要采用流的形式读入当前对象的二进制输入，再写出二进制数据对应的对象
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        // 将对象序列化到二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        // 从二进制流中读出产生的新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "[name: " + name + ", list: " + list.toString() + "]";
    }
}

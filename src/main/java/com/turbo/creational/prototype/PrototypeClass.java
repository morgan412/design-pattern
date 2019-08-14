package com.turbo.creational.prototype;

import java.util.ArrayList;

/**
 * 原型模式
 *
 * @author zouxq
 */
public class PrototypeClass implements Cloneable {

    private String name;
    private ArrayList<String> list = new ArrayList<>();

    @Override
    protected PrototypeClass clone() throws CloneNotSupportedException {
        return (PrototypeClass) super.clone();
    }

    protected PrototypeClass clone2() throws CloneNotSupportedException {
        PrototypeClass newPrototypeClass = (PrototypeClass) super.clone();
        newPrototypeClass.list = (ArrayList<String>) this.list.clone();
        return newPrototypeClass;
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

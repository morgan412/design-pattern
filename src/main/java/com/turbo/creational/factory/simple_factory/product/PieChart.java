package com.turbo.creational.factory.simple_factory.product;

/**
 * 饼图
 *
 * @author zouxq
 */
public class PieChart implements IChart {
    @Override
    public void display() {
        System.out.println("this is a pieChart!");
    }
}

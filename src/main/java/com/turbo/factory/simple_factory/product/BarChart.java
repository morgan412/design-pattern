package com.turbo.factory.simple_factory.product;

/**
 * 柱状图
 *
 * @author zouxq
 */
public class BarChart implements IChart {
    @Override
    public void display() {
        System.out.println("this is a barChart!");
    }
}

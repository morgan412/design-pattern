package com.turbo.factory.factory_method.product;

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

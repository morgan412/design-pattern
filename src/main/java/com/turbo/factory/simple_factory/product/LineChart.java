package com.turbo.factory.simple_factory.product;

/**
 * 折线图
 *
 * @author zouxq
 */
public class LineChart implements IChart {
    @Override
    public void display() {
        System.out.println("this is a lineChart!");
    }
}

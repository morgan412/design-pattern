package com.turbo.creational.factory.factory_method.factory;

import com.turbo.creational.factory.factory_method.product.BarChart;
import com.turbo.creational.factory.factory_method.product.IChart;

/**
 * 具体工厂
 *
 * @author zouxq
 */
public class BarChartFactory implements IChartFactory{
    @Override
    public IChart getChart() {
        return new BarChart();
    }
}

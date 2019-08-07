package com.turbo.factory.factory_method.factory;

import com.turbo.factory.factory_method.product.IChart;
import com.turbo.factory.factory_method.product.PieChart;

/**
 * 具体工厂
 *
 * @author zouxq
 */
public class LineChartFactory implements IChartFactory{
    @Override
    public IChart getChart() {
        return new PieChart();
    }
}

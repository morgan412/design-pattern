package com.turbo.creational.factory.factory_method.factory;

import com.turbo.creational.factory.factory_method.product.IChart;

/**
 * 工厂类接口
 *
 * @author zouxq
 */
public interface IChartFactory {

    /**
     * 获取图表
     *
     * @return 具体图表对象
     */
    IChart getChart();
}

package com.turbo.factory.simple_factory.factory;

import com.turbo.factory.simple_factory.product.BarChart;
import com.turbo.factory.simple_factory.product.IChart;
import com.turbo.factory.simple_factory.product.LineChart;
import com.turbo.factory.simple_factory.product.PieChart;

/**
 * 简单工厂
 * 工厂类提供创建对象的方法（如create），接收一个参数，通过不同的参数实例化不同的产品类
 *
 * @author zouxq
 */
public class ChartFactory {

    /**
     * 创建图表  负担太重、不符合开闭原则
     *
     * @param type 类型
     * @return 图表
     */
    public static IChart create(String type) {
        switch (type) {
            case "bar":
                return new BarChart();
            case "pie":
                return new PieChart();
            case "line":
                return new LineChart();
            default:
                return null;
        }
    }
}

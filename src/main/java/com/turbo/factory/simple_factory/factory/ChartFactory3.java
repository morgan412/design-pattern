package com.turbo.factory.simple_factory.factory;

import com.turbo.factory.simple_factory.product.BarChart;
import com.turbo.factory.simple_factory.product.IChart;
import com.turbo.factory.simple_factory.product.LineChart;
import com.turbo.factory.simple_factory.product.PieChart;

/**
 * 使用反射机制改良简单工厂
 *
 * @author zouxq
 */
public class ChartFactory3 {

    public static IChart create(Class<? extends IChart> clazz) {
        IChart chart = null;
        try {
            chart = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return chart;
    }

    public static IChart create(String className) {
        IChart chart = null;
        try {
            chart = (IChart) Class.forName(className).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return chart;
    }
}

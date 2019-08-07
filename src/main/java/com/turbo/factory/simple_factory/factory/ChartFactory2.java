package com.turbo.factory.simple_factory.factory;

import com.turbo.factory.simple_factory.product.BarChart;
import com.turbo.factory.simple_factory.product.LineChart;
import com.turbo.factory.simple_factory.product.PieChart;

/**
 * 简单工厂，又叫静态方法工厂
 *
 * @author zouxq
 */
public class ChartFactory2 {

    public static BarChart createBarChart() {
        return new BarChart();
    }

    public static PieChart createPieChart() {
        return new PieChart();
    }

    public static LineChart createLineChart() {
        return new LineChart();
    }
}

package com.turbo.creational.factory.factory_method;

import com.turbo.creational.factory.factory_method.factory.BarChartFactory;
import com.turbo.creational.factory.factory_method.factory.IChartFactory;
import com.turbo.creational.factory.factory_method.factory.LineChartFactory;
import com.turbo.creational.factory.factory_method.factory.PieChartFactory;
import com.turbo.creational.factory.factory_method.product.IChart;
import org.junit.Test;

/**
 * @author zouxq
 */
public class FactoryMethodDemo {

    @Test
    public void test() {
        IChartFactory barChartFactory = new BarChartFactory();
        IChart barChart = barChartFactory.getChart();
        barChart.display();

        IChartFactory pieChartFactory = new PieChartFactory();
        IChart pieChart = pieChartFactory.getChart();
        pieChart.display();

        IChartFactory lineChartFactory = new LineChartFactory();
        IChart lineChart = lineChartFactory.getChart();
        lineChart.display();
    }
}

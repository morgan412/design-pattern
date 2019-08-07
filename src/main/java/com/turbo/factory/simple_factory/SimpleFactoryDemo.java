package com.turbo.factory.simple_factory;

import com.turbo.factory.simple_factory.factory.ChartFactory;
import com.turbo.factory.simple_factory.product.IChart;
import org.junit.Test;

/**
 *
 * @author zouxq
 */
public class SimpleFactoryDemo {

    @Test
    public void test() {
        IChart barChart = ChartFactory.create("bar");
        IChart pieChart = ChartFactory.create("pie");
        IChart lineChart = ChartFactory.create("line");
        barChart.display();
        pieChart.display();
        lineChart.display();
    }
}

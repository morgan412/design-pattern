package com.turbo.creational.builder.director;

import com.turbo.creational.builder.builder.AbstractMealBuilder;
import com.turbo.creational.builder.builder.ConcreteMealBuilderA;
import com.turbo.creational.builder.builder.ConcreteMealBuilderB;
import org.junit.Test;

/**
 * @author zouxq
 */
public class DirectorDemo {
    @Test
    public void test() {
        AbstractMealBuilder mealBuilderA = new ConcreteMealBuilderA();
        Director directorA = new Director(mealBuilderA);
        System.out.println("A套餐：" + directorA.construct());

        AbstractMealBuilder mealBuilderB = new ConcreteMealBuilderB();
        Director directorB = new Director(mealBuilderB);
        System.out.println("B套餐：" + directorB.construct());
    }
}

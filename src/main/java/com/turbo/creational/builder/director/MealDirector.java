package com.turbo.creational.builder.director;

import com.turbo.creational.builder.builder.MealBuilder;
import com.turbo.creational.builder.product.Meal;
import org.junit.Test;

/**
 *
 * @author zouxq
 */
public class MealDirector {

    @Test
    public void test(){
        MealBuilder mealBuilder = new MealBuilder();
        // 组装一个产品
        Meal meal = mealBuilder.addFood("汉堡").addFood("鸡肉卷").addDrink("可乐").build();
        System.out.println(meal);
    }
}

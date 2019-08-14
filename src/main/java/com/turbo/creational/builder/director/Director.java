package com.turbo.creational.builder.director;

import com.turbo.creational.builder.builder.AbstractMealBuilder;
import com.turbo.creational.builder.product.Meal;

/**
 * @author zouxq
 */
public class Director {
    private AbstractMealBuilder mealBuilder;

    public Director(AbstractMealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal construct() {
        mealBuilder.buildFood();
        mealBuilder.buildDrink();
        return mealBuilder.build();
    }
}

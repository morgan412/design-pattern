package com.turbo.builder.builder;

import com.turbo.builder.product.Meal;

/**
 * 具体建造者
 *
 * @author zouxq
 */
public class MealBuilder {
    private Meal meal;

    public MealBuilder() {
        meal = new Meal();
    }

    public MealBuilder addFood(String foodName) {
        meal.getFoods().add(foodName);
        return this;
    }

    public MealBuilder addDrink(String drinkName) {
        meal.getDrinks().add(drinkName);
        return this;
    }

    public Meal build() {
        return meal;
    }
}

package com.turbo.creational.builder.builder;

import com.turbo.creational.builder.product.Meal;

/**
 * 抽象建造者
 *
 * @author zouxq
 */
public abstract class AbstractMealBuilder {
    protected Meal meal;

    public AbstractMealBuilder() {
        meal = new Meal();
    }

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal build() {
        return meal;
    }
}

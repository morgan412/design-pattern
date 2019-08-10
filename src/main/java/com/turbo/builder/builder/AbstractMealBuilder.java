package com.turbo.builder.builder;

import com.turbo.builder.product.Meal;

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

package com.turbo.builder.builder;

/**
 * 具体建造者
 *
 * @author zouxq
 */
public class ConcreteMealBuilderB extends AbstractMealBuilder{
    @Override
    public void buildFood() {
        meal.getFoods().add("牛肉堡");
        meal.getFoods().add("薯条");
    }

    @Override
    public void buildDrink() {
        meal.getDrinks().add("橙汁");
    }
}

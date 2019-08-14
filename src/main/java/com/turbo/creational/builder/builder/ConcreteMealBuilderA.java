package com.turbo.creational.builder.builder;

/**
 * 具体建造者
 *
 * @author zouxq
 */
public class ConcreteMealBuilderA extends AbstractMealBuilder{
    @Override
    public void buildFood() {
        meal.getFoods().add("辣鸡堡");
        meal.getFoods().add("鸡肉卷");
    }

    @Override
    public void buildDrink() {
        meal.getDrinks().add("可乐");
    }
}

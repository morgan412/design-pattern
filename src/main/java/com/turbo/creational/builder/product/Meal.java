package com.turbo.creational.builder.product;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类
 *
 * @author zouxq
 */
public class Meal {
    private List<String> foods;
    private List<String> drinks;

    public Meal() {
        this.foods = new ArrayList<>();
        this.drinks = new ArrayList<>();
    }

    public List<String> getFoods() {
        return foods;
    }

    public void setFoods(List<String> foods) {
        this.foods = foods;
    }

    public List<String> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<String> drinks) {
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "Meal{" + "foods=" + foods + ", drinks=" + drinks + '}';
    }
}

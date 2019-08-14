package com.turbo.creational.factory.abstract_factory.product;

/**
 * @author zouxq
 */
public class IntelMainboard implements IMainboard {
    @Override
    public void installMainboard() {
        System.out.println("install intel mainboard");
    }
}

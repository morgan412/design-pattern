package com.turbo.factory.abstract_factory.product;

/**
 * @author zouxq
 */
public class AmdMainboard implements IMainboard {
    @Override
    public void installMainboard() {
        System.out.println("install amd mainboard");
    }
}

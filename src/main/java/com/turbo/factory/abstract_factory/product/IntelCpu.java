package com.turbo.factory.abstract_factory.product;

/**
 * @author zouxq
 */
public class IntelCpu implements ICpu {
    @Override
    public void installCpu() {
        System.out.println("install intel cpu");
    }
}

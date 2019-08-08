package com.turbo.factory.abstract_factory.product;

/**
 * @author zouxq
 */
public class AmdCpu implements ICpu {
    @Override
    public void installCpu() {
        System.out.println("install amd cpu");
    }
}

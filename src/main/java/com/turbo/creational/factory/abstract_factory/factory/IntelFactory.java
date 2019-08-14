package com.turbo.creational.factory.abstract_factory.factory;

import com.turbo.creational.factory.abstract_factory.product.*;

/**
 * @author zouxq
 */
public class IntelFactory implements IFactory{

    @Override
    public ICpu createCpu() {
        return new IntelCpu();
    }

    @Override
    public IMainboard createMainboard() {
        return new IntelMainboard();
    }
}

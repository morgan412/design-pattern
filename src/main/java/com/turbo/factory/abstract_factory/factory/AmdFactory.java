package com.turbo.factory.abstract_factory.factory;

import com.turbo.factory.abstract_factory.product.*;

/**
 * @author zouxq
 */
public class AmdFactory implements IFactory{

    @Override
    public ICpu createCpu() {
        return new AmdCpu();
    }

    @Override
    public IMainboard createMainboard() {
        return new AmdMainboard();
    }
}

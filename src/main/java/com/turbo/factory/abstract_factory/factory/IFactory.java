package com.turbo.factory.abstract_factory.factory;

import com.turbo.factory.abstract_factory.product.ICpu;
import com.turbo.factory.abstract_factory.product.IMainboard;

/**
 * @author zouxq
 */
public interface IFactory {

    ICpu createCpu();

    IMainboard createMainboard();
}

package com.turbo.factory.abstract_factory;

import com.turbo.factory.abstract_factory.factory.AmdFactory;
import com.turbo.factory.abstract_factory.factory.IFactory;
import com.turbo.factory.abstract_factory.factory.IntelFactory;
import com.turbo.factory.abstract_factory.product.ICpu;
import com.turbo.factory.abstract_factory.product.IMainboard;
import org.junit.Test;

/**
 * 抽象工厂
 * @author zouxq
 */
public class AbstractFactoryDemo {

    @Test
    public void test(){
        IFactory intelFactory = new IntelFactory();
        ICpu intelCpu = intelFactory.createCpu();
        IMainboard intelMainboard = intelFactory.createMainboard();
        intelCpu.installCpu();
        intelMainboard.installMainboard();

        IFactory amdFactory = new AmdFactory();
        ICpu amdCpu = amdFactory.createCpu();
        IMainboard amdMainboard = amdFactory.createMainboard();
        amdCpu.installCpu();
        amdMainboard.installMainboard();
    }
}

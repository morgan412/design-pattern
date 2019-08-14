package com.turbo.structural.adapter.adapter;

import com.turbo.structural.adapter._target.TypeC;
import com.turbo.structural.adapter.adaptee.CommonHeadset;

/**
 * 适配器
 *
 * @author zouxq
 */
public class CommonHeadsetAdapter2 extends CommonHeadset implements TypeC {

    @Override
    public void useTypeCPort() {
        System.out.println("使用Type-C转接头");
        super.listen();
    }
}

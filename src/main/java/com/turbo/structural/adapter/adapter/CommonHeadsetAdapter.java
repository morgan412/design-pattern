package com.turbo.structural.adapter.adapter;

import com.turbo.structural.adapter._target.TypeC;
import com.turbo.structural.adapter.adaptee.CommonHeadset;
import com.turbo.structural.adapter.adaptee.Headset;

import javax.swing.text.TabableView;

/**
 * 适配器
 *
 * @author zouxq
 */
public class CommonHeadsetAdapter implements TypeC {

    private CommonHeadset headset;

    public CommonHeadsetAdapter(CommonHeadset headset){
        this.headset = headset;
    }

    @Override
    public void useTypeCPort() {
        System.out.println("使用Type-C转接头");
        this.headset.listen();
    }
}

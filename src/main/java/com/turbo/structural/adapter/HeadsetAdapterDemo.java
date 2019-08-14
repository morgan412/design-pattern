package com.turbo.structural.adapter;

import com.turbo.structural.adapter.adaptee.CommonHeadset;
import com.turbo.structural.adapter.adaptee.Headset;
import com.turbo.structural.adapter.adapter.CommonHeadsetAdapter;
import com.turbo.structural.adapter.adapter.CommonHeadsetAdapter2;
import org.junit.Test;

/**
 * @author zouxq
 */
public class HeadsetAdapterDemo {

    @Test
    public void adapterTest(){
        CommonHeadset headset = new CommonHeadset();
        CommonHeadsetAdapter headsetAdapter = new CommonHeadsetAdapter(headset);
        headsetAdapter.useTypeCPort();
    }

    @Test
    public void adapter2Test(){
        CommonHeadsetAdapter2 headsetAdapter = new CommonHeadsetAdapter2();
        headsetAdapter.useTypeCPort();
    }
}

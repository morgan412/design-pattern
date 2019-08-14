package com.turbo.structural.adapter.adaptee;

import java.util.HashMap;

/**
 * 适配者 被适配的对象
 * @author zouxq
 */
public class CommonHeadset implements Headset {

    @Override
    public void listen() {
        System.out.println("使用3.5mm耳机享受音乐...");
    }
}

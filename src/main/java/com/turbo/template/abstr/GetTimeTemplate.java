package com.turbo.template.abstr;

/**
 * 模板设计模式
 * 抽取一个抽象模板类，同时定义模板方法 对于模板方法的实现，在子类中去实现
 *
 * @author zouxq
 */
public abstract class GetTimeTemplate {

    /**
     * 基本方法，由子类实现 （钩子方法）
     */
    public abstract void code();

    /**
     * 模板方法 固定流程方法
     */
    public final long getTime() {
        // 获取起始时间
        long t1 = System.currentTimeMillis();

        // 调用基本方法
        code();

        // 获取结束时间
        long t2 = System.currentTimeMillis();
        return t2 - t1;
    }
}

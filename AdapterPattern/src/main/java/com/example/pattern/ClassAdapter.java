package com.example.pattern;

/**
 * 类适配器 - 通过继承Adaptee类并实现Target接口的方式实现适配
 * 这是类适配器模式的实现，与对象适配器模式（Adapter）不同
 */
public class ClassAdapter extends Adaptee implements Target {
    /**
     * 实现Target接口的request方法
     * 通过继承关系直接调用父类的specificRequest方法
     */
    @Override
    public void request() {
        System.out.println("类适配器调用开始");
        // 直接调用从父类继承的方法
        super.specificRequest();
        System.out.println("类适配器调用结束");
    }
}
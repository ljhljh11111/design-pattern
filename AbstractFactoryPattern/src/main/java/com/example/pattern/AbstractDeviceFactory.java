package com.example.pattern;

// 抽象设备工厂接口
public interface AbstractDeviceFactory {
    // 创建手机产品
    Phone createPhone();
    // 创建笔记本电脑产品
    Laptop createLaptop();
}
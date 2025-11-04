package com.example.pattern;

// 华为工厂（具体工厂）
public class HuaweiFactory implements AbstractDeviceFactory {
    @Override
    public Phone createPhone() {
        // 可以在这里添加华为手机的初始化逻辑
        return new HuaweiPhone();
    }

    @Override
    public Laptop createLaptop() {
        // 可以在这里添加华为笔记本电脑的初始化逻辑
        return new HuaweiLaptop();
    }
}
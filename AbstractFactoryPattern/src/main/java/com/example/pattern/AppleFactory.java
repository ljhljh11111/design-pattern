package com.example.pattern;

// 苹果工厂（具体工厂）
public class AppleFactory implements AbstractDeviceFactory {
    @Override
    public Phone createPhone() {
        // 可以在这里添加苹果手机的初始化逻辑
        return new ApplePhone();
    }

    @Override
    public Laptop createLaptop() {
        // 可以在这里添加苹果笔记本电脑的初始化逻辑
        return new AppleLaptop();
    }
}
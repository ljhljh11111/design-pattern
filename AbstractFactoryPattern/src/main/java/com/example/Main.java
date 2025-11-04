package com.example;

import com.example.pattern.*;

public class Main {
    public static void main(String[] args) {
        // 1. 使用华为工厂创建华为设备
        AbstractDeviceFactory huaweiFactory = new HuaweiFactory();
        Phone huaweiPhone = huaweiFactory.createPhone();
        Laptop huaweiLaptop = huaweiFactory.createLaptop();
        
        System.out.println("=== 华为设备 ===");
        System.out.println("手机品牌: " + huaweiPhone.getBrand());
        huaweiPhone.call();
        System.out.println("笔记本品牌: " + huaweiLaptop.getBrand());
        huaweiLaptop.runProgram();
        
        System.out.println();
        
        // 2. 使用苹果工厂创建苹果设备
        AbstractDeviceFactory appleFactory = new AppleFactory();
        Phone applePhone = appleFactory.createPhone();
        Laptop appleLaptop = appleFactory.createLaptop();
        
        System.out.println("=== 苹果设备 ===");
        System.out.println("手机品牌: " + applePhone.getBrand());
        applePhone.call();
        System.out.println("笔记本品牌: " + appleLaptop.getBrand());
        appleLaptop.runProgram();
    }
}/*
抽象工厂模式解析

抽象工厂模式是工厂方法模式的扩展，它提供了一种创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。

在这个例子中：
- 产品族：同一品牌的产品集合（如华为手机和华为笔记本）
- 产品等级结构：不同品牌但功能相似的产品（如华为手机和苹果手机都属于手机产品等级）
- 抽象工厂：定义了创建产品族的接口（AbstractDeviceFactory）
- 具体工厂：实现了创建特定产品族的逻辑（HuaweiFactory、AppleFactory）

优点
1. 隔离具体类：客户端不需要知道它所创建的对象的具体类
2. 产品族一致性：保证产品族中的产品相互匹配
3. 易于交换产品族：只需切换具体工厂，就能使用不同的产品族
4. 增加新的产品族简单：只需新增具体工厂和产品类，无需修改现有代码

如果需要新增一个新品牌，如三星，只需添加SamsungFactory、SamsungPhone和SamsungLaptop类，无需修改现有代码，符合开闭原则。
*/
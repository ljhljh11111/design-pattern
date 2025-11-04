package com.example.pattern;

// 华为笔记本电脑（具体产品）
public class HuaweiLaptop implements Laptop {
    @Override
    public void runProgram() {
        System.out.println("华为笔记本电脑正在运行程序...");
    }

    @Override
    public String getBrand() {
        return "Huawei";
    }
}
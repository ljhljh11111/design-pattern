package com.example.pattern;

// 苹果笔记本电脑（具体产品）
public class AppleLaptop implements Laptop {
    @Override
    public void runProgram() {
        System.out.println("苹果笔记本电脑正在运行程序...");
    }

    @Override
    public String getBrand() {
        return "Apple";
    }
}
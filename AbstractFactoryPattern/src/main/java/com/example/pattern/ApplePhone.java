package com.example.pattern;

// 苹果手机（具体产品）
public class ApplePhone implements Phone {
    @Override
    public void call() {
        System.out.println("苹果手机正在拨打电话...");
    }

    @Override
    public String getBrand() {
        return "Apple";
    }
}
package com.example.pattern;

// 华为手机（具体产品）
public class HuaweiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("华为手机正在拨打电话...");
    }

    @Override
    public String getBrand() {
        return "Huawei";
    }
}
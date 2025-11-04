package com.example.pattern;

// 支付策略接口（策略接口）
public interface PaymentStrategy {
    // 支付方法
    void pay(double amount);
    // 获取支付方式名称
    String getPaymentName();
}
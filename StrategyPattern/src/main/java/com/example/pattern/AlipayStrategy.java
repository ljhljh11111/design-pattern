package com.example.pattern;

// 支付宝支付策略（具体策略1）
public class AlipayStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("使用支付宝支付: " + amount + "元");
        System.out.println("支付宝支付成功，交易已完成！");
    }

    @Override
    public String getPaymentName() {
        return "支付宝支付";
    }
}
package com.example.pattern;

// 信用卡支付策略（具体策略3）
public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("使用信用卡支付: " + amount + "元");
        System.out.println("信用卡支付成功，交易已完成！");
    }

    @Override
    public String getPaymentName() {
        return "信用卡支付";
    }
}
package com.example.pattern;

// 微信支付策略（具体策略2）
public class WechatPayStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("使用微信支付: " + amount + "元");
        System.out.println("微信支付成功，交易已完成！");
    }

    @Override
    public String getPaymentName() {
        return "微信支付";
    }
}
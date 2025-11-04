package com.example.pattern;

// 支付上下文类（上下文类）
public class PaymentContext {
    // 持有一个支付策略对象
    private PaymentStrategy paymentStrategy;

    // 构造方法，初始化支付策略
    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // 设置支付策略（运行时可以动态切换策略）
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // 执行支付操作
    public void executePayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("请先设置支付方式");
            return;
        }
        System.out.println("选择支付方式: " + paymentStrategy.getPaymentName());
        paymentStrategy.pay(amount);
    }
}
package com.example;

import com.example.pattern.*;

public class Main {
    public static void main(String[] args) {
        // 1. 创建具体的支付策略
        PaymentStrategy alipayStrategy = new AlipayStrategy();
        PaymentStrategy wechatPayStrategy = new WechatPayStrategy();
        PaymentStrategy creditCardStrategy = new CreditCardStrategy();
        
        // 2. 创建支付上下文，并初始化为支付宝支付
        PaymentContext paymentContext = new PaymentContext(alipayStrategy);
        
        // 3. 使用支付宝支付100元
        System.out.println("=== 场景1：使用支付宝支付 ===");
        paymentContext.executePayment(100.0);
        
        System.out.println();
        
        // 4. 动态切换到微信支付
        System.out.println("=== 场景2：切换为微信支付 ===");
        paymentContext.setPaymentStrategy(wechatPayStrategy);
        paymentContext.executePayment(200.0);
        
        System.out.println();
        
        // 5. 动态切换到信用卡支付
        System.out.println("=== 场景3：切换为信用卡支付 ===");
        paymentContext.setPaymentStrategy(creditCardStrategy);
        paymentContext.executePayment(300.0);
    }
}/*
策略模式解析

策略模式定义了算法家族，分别封装起来，让它们之间可以互相替换。策略模式让算法的变化独立于使用算法的客户。

在这个例子中：
- 策略接口（PaymentStrategy）：定义了所有支持的算法的公共接口
- 具体策略（AlipayStrategy、WechatPayStrategy、CreditCardStrategy）：封装了具体的算法实现
- 上下文（PaymentContext）：持有一个策略对象的引用，使用策略对象来执行具体的算法

优点
1. 策略模式提供了管理相关的算法族的办法，各个算法可以以相同的方式调用，减少了各种算法类与使用算法类之间的耦合
2. 策略模式提供了可以替换继承关系的办法，避免使用多重条件转移语句
3. 策略模式可以提供相同行为的不同实现，客户可以根据不同时间或空间要求选择不同的
4. 增加新的策略类符合开闭原则，无需修改现有代码

如果需要新增一种支付方式，比如银联支付，只需添加UnionPayStrategy类，无需修改现有代码。
*/
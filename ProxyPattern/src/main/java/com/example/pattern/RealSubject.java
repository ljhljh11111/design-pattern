package com.example.pattern;

/**
 * 真实主题类 - 实现Subject接口，提供实际的业务逻辑
 */
public class RealSubject implements Subject {
    /**
     * 实现请求方法，提供实际的业务功能
     */
    @Override
    public void request() {
        System.out.println("RealSubject: 执行实际的请求业务逻辑");
        // 模拟复杂的业务处理
        try {
            Thread.sleep(500); // 模拟处理时间
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 实现带参数的请求方法
     */
    @Override
    public String requestWithParam(String param) {
        System.out.println("RealSubject: 处理带参数的请求，参数为: " + param);
        // 模拟业务处理并返回结果
        return "处理结果: " + param.toUpperCase();
    }
}
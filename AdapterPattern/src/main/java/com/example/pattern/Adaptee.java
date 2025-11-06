package com.example.pattern;

/**
 * 被适配类 - 需要被适配的已有类
 * 它有自己的接口（specificRequest方法），但与客户端期望的接口不兼容
 */
public class Adaptee {
    /**
     * 被适配类的特定请求方法
     * 这个方法的接口与Target接口不同，需要通过适配器转换
     */
    public void specificRequest() {
        System.out.println("Adaptee的特定请求方法被调用");
    }
}
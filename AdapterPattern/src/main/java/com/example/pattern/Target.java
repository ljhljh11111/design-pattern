package com.example.pattern;

/**
 * 目标接口 - 定义客户端期望的接口
 * 这是客户端使用的接口，也是适配器需要实现的接口
 */
public interface Target {
    /**
     * 客户端期望的请求方法
     */
    void request();
}
package com.example.pattern;

/**
 * 主题接口 - 定义代理类和真实主题共同实现的接口
 */
public interface Subject {
    /**
     * 请求方法
     */
    void request();
    
    /**
     * 带参数的请求方法
     * @param param 参数
     * @return 返回结果
     */
    String requestWithParam(String param);
}
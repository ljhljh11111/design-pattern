package com.example.pattern;

// 日志工厂接口（工厂接口）
public interface LoggerFactory {
    // 工厂方法：创建日志记录器
    Logger createLogger();
}
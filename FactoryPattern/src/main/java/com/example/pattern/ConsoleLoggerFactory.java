package com.example.pattern;

// 控制台日志工厂（具体工厂1）
public class ConsoleLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        // 可以在这里添加控制台日志的初始化逻辑（如配置格式）
        return new ConsoleLogger();
    }
}
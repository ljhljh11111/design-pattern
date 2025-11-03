package com.example.pattern;

// 文件日志工厂（具体工厂2）
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        // 可以在这里添加文件日志的初始化逻辑（如创建文件、设置路径）
        return new FileLogger();
    }
}
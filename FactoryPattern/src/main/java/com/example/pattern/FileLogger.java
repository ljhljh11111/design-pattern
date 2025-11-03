package com.example.pattern;

// 文件日志（具体产品2）
public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("文件日志: " + message + "（已写入日志文件）");
    }
}
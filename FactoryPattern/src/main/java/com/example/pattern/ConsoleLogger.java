package com.example.pattern;

// 控制台日志（具体产品1）
public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("控制台日志: " + message);
    }
}
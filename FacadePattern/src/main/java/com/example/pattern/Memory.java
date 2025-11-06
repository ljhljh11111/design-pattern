package com.example.pattern;

/**
 * 内存子系统组件 - 子系统中的一个复杂组件
 */
public class Memory {
    /**
     * 内存初始化方法
     */
    public void initialize() {
        System.out.println("内存 初始化中...");
        // 模拟内存初始化的复杂过程
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("内存 初始化完成");
    }
    
    /**
     * 内存清理方法
     */
    public void cleanup() {
        System.out.println("内存 清理中...");
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("内存 已清理");
    }
    
    /**
     * 内存读写方法
     * @param address 内存地址
     * @param data 要写入的数据，如果为null则表示读取操作
     * @return 读取的数据，如果是写入操作则返回null
     */
    public String access(int address, String data) {
        if (data != null) {
            System.out.println("内存 写入地址 " + address + ": " + data);
            return null;
        } else {
            System.out.println("内存 读取地址 " + address);
            return "数据@" + address;
        }
    }
}
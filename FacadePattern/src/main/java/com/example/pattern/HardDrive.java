package com.example.pattern;

/**
 * 硬盘子系统组件 - 子系统中的一个复杂组件
 */
public class HardDrive {
    /**
     * 硬盘启动方法
     */
    public void start() {
        System.out.println("硬盘 启动中...");
        // 模拟硬盘启动的复杂过程
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("硬盘 启动完成");
    }
    
    /**
     * 硬盘停止方法
     */
    public void stop() {
        System.out.println("硬盘 停止中...");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("硬盘 已停止");
    }
    
    /**
     * 硬盘读写扇区方法
     * @param sector 扇区地址
     * @param data 要写入的数据，如果为null则表示读取操作
     * @return 读取的数据，如果是写入操作则返回null
     */
    public byte[] readWriteSector(int sector, byte[] data) {
        if (data != null) {
            System.out.println("硬盘 写入扇区 " + sector + ", 数据大小: " + data.length + " 字节");
            return null;
        } else {
            System.out.println("硬盘 读取扇区 " + sector);
            return new byte[]{1, 2, 3, 4, 5}; // 模拟读取的数据
        }
    }
}
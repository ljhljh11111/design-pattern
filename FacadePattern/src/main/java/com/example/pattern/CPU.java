package com.example.pattern;

/**
 * CPU子系统组件 - 子系统中的一个复杂组件
 */
public class CPU {
    /**
     * CPU启动方法
     */
    public void start() {
        System.out.println("CPU 启动中...");
        // 模拟CPU启动的复杂过程
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("CPU 启动完成");
    }
    
    /**
     * CPU关闭方法
     */
    public void shutdown() {
        System.out.println("CPU 关闭中...");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("CPU 已关闭");
    }
    
    /**
     * CPU执行指令方法
     * @param instruction 要执行的指令
     */
    public void execute(String instruction) {
        System.out.println("CPU 执行指令: " + instruction);
    }
}
package com.example.pattern;

//4. 双重检查锁（DCL，推荐使用）
//特点：结合了延迟初始化和线程安全，通过双重检查和 volatile 关键字，既保证性能又避免多实例创建，是生产环境中最常用的单例实现。
public class DoubleCheckSingleton {
    // volatile 防止指令重排，保证实例可见性
    private static volatile DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {}

    public static DoubleCheckSingleton getInstance() {
        // 第一次检查：减少锁竞争
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                // 第二次检查：防止多线程同时进入第一个 if 后重复创建
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("双重检查锁单例：执行操作");
    }
}
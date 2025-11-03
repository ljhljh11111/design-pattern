package com.example.pattern;
//2. 懒汉式（线程不安全，延迟初始化）
//特点：延迟初始化（首次调用时创建实例），但多线程环境下会创建多个实例，仅适合单线程场景。
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {}

    // 线程不安全：多线程下可能创建多个实例
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("懒汉式单例（线程不安全）：执行操作");
    }
}
package com.example.pattern;

//5. 静态内部类（线程安全，延迟加载）
//特点：利用类加载机制保证线程安全，延迟加载（内部类仅在调用时加载），实现简洁且高效。
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {}

    // 静态内部类，类加载时不会初始化，只有调用 getInstance 时才加载
    private static class SingletonHolder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void doSomething() {
        System.out.println("静态内部类单例：执行操作");
    }
}
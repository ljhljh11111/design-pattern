package com.example.pattern;

//1. 饿汉式（线程安全，类加载时初始化）
//特点：类加载时就初始化实例，线程安全，但可能造成内存浪费（若实例从未被使用）。
public class HungrySingleton {
    // 类加载时直接创建实例，线程安全
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    // 私有构造方法，防止外部实例化
    private HungrySingleton() {}

    // 提供全局访问点
    public static HungrySingleton getInstance() {
        return INSTANCE;
    }

    // 测试方法
    public void doSomething() {
        System.out.println("饿汉式单例：执行操作");
    }
}
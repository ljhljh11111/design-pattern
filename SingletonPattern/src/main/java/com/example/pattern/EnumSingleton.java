package com.example.pattern;
//6. 枚举单例（天然线程安全，防止反射 / 序列化破坏）
//特点：Java 枚举天然支持单例，且能 ** 防止反射（枚举构造方法默认私有且不可被反射调用）和序列化（枚举实例序列化时不会创建新实例）
//        ** 破坏单例，是《Effective Java》推荐的 “最安全的单例实现”。
public enum EnumSingleton {
    INSTANCE;

    // 枚举单例的方法
    public void doSomething() {
        System.out.println("枚举单例：执行操作");
    }
}
package com.example.pattern;

//3. 懒汉式（线程安全，加同步锁）
//特点：通过 synchronized 保证线程安全，但锁粒度大，高并发下性能不佳。
public class ThreadSafeLazySingleton {
    private static ThreadSafeLazySingleton instance;

    private ThreadSafeLazySingleton() {}

    // 方法加同步锁，保证线程安全，但性能较差（每次调用都加锁）
    public static synchronized ThreadSafeLazySingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazySingleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("懒汉式单例（线程安全）：执行操作");
    }
}
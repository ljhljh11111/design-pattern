package com.example.pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理处理器 - 实现InvocationHandler接口
 * 用于在运行时动态生成代理对象
 */
public class DynamicProxy implements InvocationHandler {
    // 被代理的目标对象
    private Object target;
    
    /**
     * 构造方法，接收目标对象
     * @param target 被代理的目标对象
     */
    public DynamicProxy(Object target) {
        this.target = target;
    }
    
    /**
     * 创建代理对象的静态方法
     * @param target 被代理的目标对象
     * @return 生成的代理对象
     */
    @SuppressWarnings("unchecked")
    public static <T> T createProxy(Object target) {
        // 获取目标对象的类加载器
        ClassLoader classLoader = target.getClass().getClassLoader();
        // 获取目标对象实现的接口
        Class<?>[] interfaces = target.getClass().getInterfaces();
        // 创建调用处理器
        InvocationHandler handler = new DynamicProxy(target);
        // 动态生成代理对象
        return (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
    
    /**
     * 当代理对象调用方法时，会调用此方法
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 获取方法名
        String methodName = method.getName();
        
        // 前置处理 - 可以针对不同方法做不同处理
        System.out.println("\nDynamicProxy: 开始调用方法 - " + methodName);
        System.out.println("DynamicProxy: 方法参数: " + (args == null ? "无" : java.util.Arrays.toString(args)));
        
        // 记录开始时间
        long startTime = System.currentTimeMillis();
        
        // 调用目标对象的方法
        Object result;
        try {
            // 执行真实对象的方法
            result = method.invoke(target, args);
            System.out.println("DynamicProxy: 方法调用成功");
        } catch (Exception e) {
            // 异常处理
            System.out.println("DynamicProxy: 方法调用异常 - " + e.getCause().getMessage());
            throw e.getCause(); // 抛出原始异常
        }
        
        // 记录结束时间
        long endTime = System.currentTimeMillis();
        
        // 后置处理
        System.out.println("DynamicProxy: 方法调用结束，耗时: " + (endTime - startTime) + "ms");
        System.out.println("DynamicProxy: 方法返回值: " + result);
        
        return result;
    }
}
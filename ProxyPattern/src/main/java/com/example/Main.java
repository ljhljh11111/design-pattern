package com.example;

import com.example.pattern.DynamicProxy;
import com.example.pattern.RealSubject;
import com.example.pattern.StaticProxy;
import com.example.pattern.Subject;

/**
 * 客户端类 - 演示代理模式的使用
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== 代理模式示例 =====");
        
        // 创建真实主题对象
        RealSubject realSubject = new RealSubject();
        
        System.out.println("\n1. 直接调用真实主题：");
        realSubject.request();
        String result1 = realSubject.requestWithParam("test");
        System.out.println("直接调用返回结果: " + result1);
        
        System.out.println("\n2. 使用静态代理：");
        // 创建静态代理对象
        StaticProxy staticProxy = new StaticProxy(realSubject);
        // 通过代理调用方法
        staticProxy.request();
        String result2 = staticProxy.requestWithParam("static proxy");
        System.out.println("静态代理调用返回结果: " + result2);
        
        // 测试静态代理的参数校验
        System.out.println("\n测试静态代理参数校验:");
        String errorResult = staticProxy.requestWithParam("");
        System.out.println("参数校验结果: " + errorResult);
        
        System.out.println("\n3. 使用动态代理：");
        // 创建动态代理对象
        Subject dynamicProxy = DynamicProxy.createProxy(realSubject);
        // 通过动态代理调用方法
        dynamicProxy.request();
        String result3 = dynamicProxy.requestWithParam("dynamic proxy");
        System.out.println("动态代理调用返回结果: " + result3);
        
        System.out.println("\n===== 代理模式解析 =====");
        System.out.println("1. 代理模式在不改变原始类接口的情况下，通过引入代理类来给原始类添加额外功能");
        System.out.println("2. 两种主要实现方式：");
        System.out.println("   - 静态代理：在编译期就确定代理类，需要为每个目标类创建对应的代理类");
        System.out.println("   - 动态代理：在运行时动态生成代理类，不需要预定义代理类");
        System.out.println("3. 核心组件：");
        System.out.println("   - 主题接口(Subject)：定义代理类和真实主题共同实现的接口");
        System.out.println("   - 真实主题(RealSubject)：实际执行业务逻辑的类");
        System.out.println("   - 代理类(Proxy)：包含对真实主题的引用，在调用真实主题方法前后添加额外逻辑");
        System.out.println("4. 代理模式的应用场景：");
        System.out.println("   - 远程代理：为远程对象提供本地代表");
        System.out.println("   - 虚拟代理：延迟加载大对象");
        System.out.println("   - 保护代理：控制对对象的访问权限");
        System.out.println("   - 日志代理：记录方法调用日志");
        System.out.println("   - 缓存代理：为方法调用结果提供缓存");
        System.out.println("   - 事务代理：管理事务");
        System.out.println("5. 静态代理vs动态代理：");
        System.out.println("   - 静态代理：实现简单，但代码复用性差，维护成本高");
        System.out.println("   - 动态代理：更灵活，可以代理任意实现了接口的类，减少重复代码");
    }
}
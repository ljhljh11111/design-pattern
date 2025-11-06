package com.example;

import com.example.pattern.Adaptee;
import com.example.pattern.Adapter;
import com.example.pattern.ClassAdapter;
import com.example.pattern.Target;

/**
 * 客户端类 - 演示适配器模式的使用
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== 适配器模式示例 =====");
        
        // 创建被适配的对象
        Adaptee adaptee = new Adaptee();
        
        System.out.println("\n1. 不使用适配器，直接调用Adaptee：");
        adaptee.specificRequest();
        
        System.out.println("\n2. 使用对象适配器（组合方式）：");
        // 创建对象适配器，传入被适配对象
        Target objectAdapter = new Adapter(adaptee);
        // 客户端通过Target接口调用，无需关心具体实现
        objectAdapter.request();
        
        System.out.println("\n3. 使用类适配器（继承方式）：");
        // 创建类适配器
        Target classAdapter = new ClassAdapter();
        // 客户端通过Target接口调用
        classAdapter.request();
        
        System.out.println("\n===== 适配器模式解析 =====");
        System.out.println("1. 适配器模式将一个类的接口转换成客户端所期望的另一个接口");
        System.out.println("2. 两种实现方式：");
        System.out.println("   - 对象适配器：通过组合方式实现，更灵活，遵循合成复用原则");
        System.out.println("   - 类适配器：通过继承方式实现，Java中受限于单继承");
        System.out.println("3. 核心组件：");
        System.out.println("   - 目标接口(Target)：客户端使用的接口");
        System.out.println("   - 被适配者(Adaptee)：需要适配的已有类");
        System.out.println("   - 适配器(Adapter)：连接Target和Adaptee的桥梁");
        System.out.println("4. 优点：");
        System.out.println("   - 让原本接口不兼容的类可以一起工作");
        System.out.println("   - 提高了类的复用性");
        System.out.println("   - 灵活性好，可扩展性强");
        System.out.println("5. 典型应用场景：");
        System.out.println("   - 系统需要使用现有的类，但该类的接口不符合系统的需求");
        System.out.println("   - 想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的类");
        System.out.println("   - 需要一个统一的输出接口，而输入端的类型不可预知");
    }
}
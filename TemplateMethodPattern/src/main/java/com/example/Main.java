package com.example;

import com.example.pattern.AbstractClass;
import com.example.pattern.ConcreteClassA;
import com.example.pattern.ConcreteClassB;

/**
 * 客户端类 - 演示模板方法模式的使用
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== 模板方法模式示例 =====");
        
        // 创建具体子类A的实例
        System.out.println("\n执行子类A的算法流程：");
        AbstractClass classA = new ConcreteClassA();
        classA.templateMethod();
        
        // 创建具体子类B的实例
        System.out.println("\n执行子类B的算法流程：");
        AbstractClass classB = new ConcreteClassB();
        classB.templateMethod();
        
        System.out.println("\n===== 模板方法模式解析 =====");
        System.out.println("1. 模板方法模式定义了算法的骨架，将一些步骤的实现延迟到子类中");
        System.out.println("2. 核心组件：");
        System.out.println("   - 抽象基类(AbstractClass)：定义算法骨架和模板方法");
        System.out.println("   - 具体子类(ConcreteClassA/B)：实现抽象方法，提供特定算法步骤");
        System.out.println("   - 钩子方法(hookMethod)：允许子类控制算法流程");
        System.out.println("3. 优点：");
        System.out.println("   - 代码复用：将公共代码放在父类中");
        System.out.println("   - 扩展性：子类可以通过覆盖抽象方法扩展功能");
        System.out.println("   - 控制反转：父类调用子类的操作(好莱坞原则)");
        System.out.println("4. 典型应用场景：");
        System.out.println("   - 一次性实现一个算法的不变部分，将可变部分留给子类实现");
        System.out.println("   - 重构时提取公共代码到父类中");
        System.out.println("   - 框架设计中的生命周期管理");
    }
}
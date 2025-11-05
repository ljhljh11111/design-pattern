package com.example;

import com.example.pattern.ConcretePrototypeA;
import com.example.pattern.ConcretePrototypeB;
import com.example.pattern.Prototype;
import com.example.pattern.PrototypeManager;

/**
 * 客户端类 - 演示原型模式的使用
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== 原型模式示例 =====");
        
        // 演示浅克隆（ConcretePrototypeA）
        System.out.println("\n===== 浅克隆演示 =====");
        ConcretePrototypeA prototypeA = new ConcretePrototypeA("A001", "原型A");
        prototypeA.addProperty("属性1");
        prototypeA.addProperty("属性2");
        
        System.out.println("原始对象A：");
        prototypeA.showInfo();
        
        // 克隆对象
        ConcretePrototypeA cloneA = (ConcretePrototypeA) prototypeA.clone();
        cloneA.setId("A002");
        cloneA.setName("克隆A");
        
        // 修改克隆对象的引用属性，观察是否影响原型对象
        cloneA.addProperty("属性3");
        
        System.out.println("克隆对象A（修改后）：");
        cloneA.showInfo();
        
        System.out.println("原型对象A（观察是否被影响）：");
        prototypeA.showInfo();
        
        // 演示深克隆（ConcretePrototypeB）
        System.out.println("\n===== 深克隆演示 =====");
        ConcretePrototypeB prototypeB = new ConcretePrototypeB("B001", "原型B");
        prototypeB.addProperty("属性X");
        prototypeB.addProperty("属性Y");
        
        System.out.println("原始对象B：");
        prototypeB.showInfo();
        
        // 克隆对象
        ConcretePrototypeB cloneB = (ConcretePrototypeB) prototypeB.clone();
        cloneB.setId("B002");
        cloneB.setName("克隆B");
        
        // 修改克隆对象的引用属性，观察是否影响原型对象
        cloneB.addProperty("属性Z");
        
        System.out.println("克隆对象B（修改后）：");
        cloneB.showInfo();
        
        System.out.println("原型对象B（观察是否被影响）：");
        prototypeB.showInfo();
        
        // 演示原型管理器
        System.out.println("\n===== 原型管理器演示 =====");
        PrototypeManager manager = PrototypeManager.getInstance();
        
        // 注册原型
        manager.register("prototypeA", prototypeA);
        manager.register("prototypeB", prototypeB);
        
        // 通过管理器获取克隆
        ConcretePrototypeA managedCloneA = (ConcretePrototypeA) manager.get("prototypeA");
        managedCloneA.setId("A003");
        managedCloneA.setName("管理器克隆A");
        
        ConcretePrototypeB managedCloneB = (ConcretePrototypeB) manager.get("prototypeB");
        managedCloneB.setId("B003");
        managedCloneB.setName("管理器克隆B");
        
        System.out.println("通过管理器获取的克隆对象A：");
        managedCloneA.showInfo();
        
        System.out.println("通过管理器获取的克隆对象B：");
        managedCloneB.showInfo();
        
        System.out.println("\n===== 原型模式解析 =====");
        System.out.println("1. 原型模式通过复制现有对象来创建新对象，而不是通过实例化类");
        System.out.println("2. 核心组件：");
        System.out.println("   - 原型接口(Prototype)：定义克隆方法");
        System.out.println("   - 具体原型(ConcretePrototypeA/B)：实现克隆方法");
        System.out.println("   - 原型管理器(PrototypeManager)：管理原型对象");
        System.out.println("3. 浅克隆 vs 深克隆：");
        System.out.println("   - 浅克隆：只复制对象的基本数据类型，引用类型仍然指向同一对象");
        System.out.println("   - 深克隆：复制对象及其所有引用类型的对象");
        System.out.println("4. 优点：");
        System.out.println("   - 避免创建对象时的复杂初始化过程");
        System.out.println("   - 动态生成对象");
        System.out.println("   - 简化创建过程");
        System.out.println("5. 典型应用场景：");
        System.out.println("   - 创建对象成本高（如数据库操作）");
        System.out.println("   - 需要动态生成对象");
        System.out.println("   - 系统中存在大量相似对象");
    }
}
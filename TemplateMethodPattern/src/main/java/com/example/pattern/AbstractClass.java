package com.example.pattern;

/**
 * 抽象基类 - 定义算法的骨架
 * 模板方法模式的核心，包含算法的基本步骤（模板方法）和由子类实现的抽象方法
 */
public abstract class AbstractClass {
    
    /**
     * 模板方法 - 定义算法的骨架
     * 声明为final，防止子类覆盖算法的整体结构
     */
    public final void templateMethod() {
        // 步骤1：通用操作，由父类实现
        step1();
        
        // 步骤2：抽象操作，由子类实现
        step2();
        
        // 步骤3：钩子方法，子类可以选择性覆盖
        if (hookMethod()) {
            hookOperation();
        }
        
        // 步骤4：通用操作，由父类实现
        step4();
    }
    
    /**
     * 步骤1 - 通用操作，由父类实现
     */
    private void step1() {
        System.out.println("执行步骤1：初始化操作");
    }
    
    /**
     * 步骤2 - 抽象操作，由子类实现
     */
    protected abstract void step2();
    
    /**
     * 钩子方法 - 子类可以选择性覆盖
     * 默认返回true，表示执行钩子操作
     */
    protected boolean hookMethod() {
        return true;
    }
    
    /**
     * 钩子操作 - 只有当钩子方法返回true时执行
     * 可以被子类覆盖以提供额外功能
     */
    protected void hookOperation() {
        System.out.println("执行钩子操作（默认实现）");
    }
    
    /**
     * 步骤4 - 通用操作，由父类实现
     */
    private void step4() {
        System.out.println("执行步骤4：完成操作");
    }
}
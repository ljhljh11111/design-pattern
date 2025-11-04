package com.example.pattern;

/**
 * 具体子类A - 实现抽象基类中的抽象方法，提供特定的算法实现
 */
public class ConcreteClassA extends AbstractClass {
    
    /**
     * 实现抽象方法step2，提供子类A特有的操作
     */
    @Override
    protected void step2() {
        System.out.println("执行步骤2（子类A）：执行A特有的业务逻辑");
    }
    
    /**
     * 覆盖钩子方法hookMethod
     * 子类A选择执行钩子操作
     */
    @Override
    protected boolean hookMethod() {
        System.out.println("子类A决定执行钩子操作");
        return true;
    }
    
    /**
     * 覆盖钩子操作hookOperation
     * 提供子类A特有的钩子操作实现
     */
    @Override
    protected void hookOperation() {
        System.out.println("执行钩子操作（子类A实现）：执行A特有的附加功能");
    }
}
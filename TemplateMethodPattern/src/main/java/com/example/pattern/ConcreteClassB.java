package com.example.pattern;

/**
 * 具体子类B - 实现抽象基类中的抽象方法，提供特定的算法实现
 */
public class ConcreteClassB extends AbstractClass {
    
    /**
     * 实现抽象方法step2，提供子类B特有的操作
     */
    @Override
    protected void step2() {
        System.out.println("执行步骤2（子类B）：执行B特有的业务逻辑");
    }
    
    /**
     * 覆盖钩子方法hookMethod
     * 子类B选择不执行钩子操作
     */
    @Override
    protected boolean hookMethod() {
        System.out.println("子类B决定不执行钩子操作");
        return false;
    }
    
    /**
     * 即使覆盖了钩子操作，但由于hookMethod返回false，此方法不会被调用
     */
    @Override
    protected void hookOperation() {
        System.out.println("执行钩子操作（子类B实现）：执行B特有的附加功能");
    }
}
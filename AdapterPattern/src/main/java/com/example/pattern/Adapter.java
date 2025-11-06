package com.example.pattern;

/**
 * 适配器类 - 实现Target接口，并持有Adaptee的引用
 * 通过组合方式（对象适配器模式）将Adaptee的接口转换为客户端期望的Target接口
 */
public class Adapter implements Target {
    // 持有被适配类的引用
    private Adaptee adaptee;
    
    /**
     * 构造方法，传入被适配对象
     * @param adaptee 被适配对象
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    
    /**
     * 实现Target接口的request方法
     * 在方法内部调用Adaptee的specificRequest方法，实现接口转换
     */
    @Override
    public void request() {
        System.out.println("适配器调用开始");
        // 调用被适配类的特定方法
        adaptee.specificRequest();
        System.out.println("适配器调用结束");
    }
}
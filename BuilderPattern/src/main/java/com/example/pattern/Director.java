package com.example.pattern;

/**
 * 指导者类 - 控制建造过程，按照特定顺序调用建造者的方法
 */
public class Director {
    // 持有建造者对象
    private Builder builder;
    
    /**
     * 构造方法，传入建造者对象
     * @param builder 建造者对象
     */
    public Director(Builder builder) {
        this.builder = builder;
    }
    
    /**
     * 设置建造者对象
     * @param builder 建造者对象
     */
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    
    /**
     * 按照标准流程构建产品
     */
    public void constructStandard() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
    
    /**
     * 按照简化流程构建产品（只构建必要部件）
     */
    public void constructSimplified() {
        builder.buildPartA();
        builder.buildPartC();
    }
}
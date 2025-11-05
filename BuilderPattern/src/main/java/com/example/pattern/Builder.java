package com.example.pattern;

/**
 * 建造者接口 - 定义创建产品各个部件的抽象方法
 */
public interface Builder {
    /**
     * 构建产品的部件A
     */
    void buildPartA();
    
    /**
     * 构建产品的部件B
     */
    void buildPartB();
    
    /**
     * 构建产品的部件C
     */
    void buildPartC();
    
    /**
     * 获取构建完成的产品
     * @return 构建好的产品对象
     */
    Product getResult();
}
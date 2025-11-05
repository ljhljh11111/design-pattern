package com.example.pattern;

/**
 * 具体建造者 - 实现Builder接口，提供构建各个部件的具体实现
 */
public class ConcreteBuilder implements Builder {
    // 持有要构建的产品对象
    private Product product = new Product();
    
    /**
     * 构建产品的部件A
     */
    @Override
    public void buildPartA() {
        product.add("部件A");
    }
    
    /**
     * 构建产品的部件B
     */
    @Override
    public void buildPartB() {
        product.add("部件B");
    }
    
    /**
     * 构建产品的部件C
     */
    @Override
    public void buildPartC() {
        product.add("部件C");
    }
    
    /**
     * 获取构建完成的产品
     * @return 构建好的产品对象
     */
    @Override
    public Product getResult() {
        return product;
    }
}
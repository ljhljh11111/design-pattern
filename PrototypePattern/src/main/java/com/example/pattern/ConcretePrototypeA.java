package com.example.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体原型类A - 实现原型接口，提供克隆方法的具体实现
 * 演示浅克隆的实现
 */
public class ConcretePrototypeA implements Prototype {
    private String id;
    private String name;
    private List<String> properties; // 引用类型属性，用于演示浅克隆
    
    /**
     * 构造方法
     * @param id 原型ID
     * @param name 原型名称
     */
    public ConcretePrototypeA(String id, String name) {
        this.id = id;
        this.name = name;
        this.properties = new ArrayList<>();
    }
    
    /**
     * 获取ID
     * @return ID
     */
    public String getId() {
        return id;
    }
    
    /**
     * 设置ID
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * 获取名称
     * @return 名称
     */
    public String getName() {
        return name;
    }
    
    /**
     * 设置名称
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 获取属性列表
     * @return 属性列表
     */
    public List<String> getProperties() {
        return properties;
    }
    
    /**
     * 添加属性
     * @param property 属性值
     */
    public void addProperty(String property) {
        properties.add(property);
    }
    
    /**
     * 克隆方法实现
     * @return 克隆出的对象
     */
    @Override
    public Object clone() {
        try {
            // Java的Object.clone()实现的是浅克隆
            return (ConcretePrototypeA) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * 显示对象信息
     */
    public void showInfo() {
        System.out.println("原型A - ID: " + id + ", Name: " + name + ", Properties: " + properties);
    }
}
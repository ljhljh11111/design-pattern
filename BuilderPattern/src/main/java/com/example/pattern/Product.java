package com.example.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类 - 表示被构建的复杂对象
 * 包含多个部件，通过Builder逐步构建
 */
public class Product {
    // 存储产品的各个部件
    private List<String> parts = new ArrayList<>();
    
    /**
     * 添加部件到产品中
     * @param part 部件名称
     */
    public void add(String part) {
        parts.add(part);
    }
    
    /**
     * 显示产品的所有部件
     */
    public void show() {
        System.out.println("产品创建中...");
        for (String part : parts) {
            System.out.println("添加部件: " + part);
        }
        System.out.println("产品创建完成！");
    }
}
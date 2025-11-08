package com.example.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构类 - 管理元素集合，允许访问者遍历所有元素
 */
public class ComputerParts {
    private List<Element> elements = new ArrayList<>();
    
    /**
     * 添加元素到对象结构中
     * @param element 元素对象
     */
    public void addElement(Element element) {
        elements.add(element);
    }
    
    /**
     * 移除元素
     * @param element 元素对象
     */
    public void removeElement(Element element) {
        elements.remove(element);
    }
    
    /**
     * 接受访问者，让访问者访问所有元素
     * @param visitor 访问者对象
     */
    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
    
    /**
     * 获取元素列表
     * @return 元素列表
     */
    public List<Element> getElements() {
        return new ArrayList<>(elements);
    }
}
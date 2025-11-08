package com.example.pattern;

/**
 * 元素接口 - 访问者模式中的元素，定义了接收访问者的方法
 */
public interface Element {
    /**
     * 接收访问者对象
     * @param visitor 访问者对象
     */
    void accept(Visitor visitor);
}
package com.example.pattern;

/**
 * 访问者接口 - 定义了对各种元素的访问方法
 */
public interface Visitor {
    /**
     * 访问具体元素：键盘
     * @param keyboard 键盘元素
     */
    void visit(Keyboard keyboard);
    
    /**
     * 访问具体元素：显示器
     * @param monitor 显示器元素
     */
    void visit(Monitor monitor);
    
    /**
     * 访问具体元素：鼠标
     * @param mouse 鼠标元素
     */
    void visit(Mouse mouse);
}
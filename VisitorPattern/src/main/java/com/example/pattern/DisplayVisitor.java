package com.example.pattern;

/**
 * 具体访问者类 - 显示访问者，用于显示元素的详细信息
 */
public class DisplayVisitor implements Visitor {
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("显示键盘详细信息:");
        System.out.println("  品牌: " + keyboard.getBrand());
        System.out.println("  类型: " + keyboard.getType());
        System.out.println("  价格: " + keyboard.getPrice());
    }
    
    @Override
    public void visit(Monitor monitor) {
        System.out.println("显示显示器详细信息:");
        System.out.println("  品牌: " + monitor.getBrand());
        System.out.println("  分辨率: " + monitor.getResolution());
        System.out.println("  价格: " + monitor.getPrice());
    }
    
    @Override
    public void visit(Mouse mouse) {
        System.out.println("显示鼠标详细信息:");
        System.out.println("  品牌: " + mouse.getBrand());
        System.out.println("  类型: " + mouse.getType());
        System.out.println("  价格: " + mouse.getPrice());
    }
}
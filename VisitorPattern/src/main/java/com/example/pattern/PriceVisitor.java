package com.example.pattern;

/**
 * 具体访问者类 - 价格访问者，用于计算所有元素的总价格
 */
public class PriceVisitor implements Visitor {
    private int totalPrice = 0;
    
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("计算键盘价格: " + keyboard.getPrice());
        totalPrice += keyboard.getPrice();
    }
    
    @Override
    public void visit(Monitor monitor) {
        System.out.println("计算显示器价格: " + monitor.getPrice());
        totalPrice += monitor.getPrice();
    }
    
    @Override
    public void visit(Mouse mouse) {
        System.out.println("计算鼠标价格: " + mouse.getPrice());
        totalPrice += mouse.getPrice();
    }
    
    /**
     * 获取所有元素的总价格
     * @return 总价格
     */
    public int getTotalPrice() {
        return totalPrice;
    }
    
    /**
     * 重置总价格
     */
    public void reset() {
        totalPrice = 0;
    }
}
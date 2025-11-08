package com.example;

import com.example.pattern.*;

/**
 * 访问者模式示例 - 客户端类
 */
public class Main {
    public static void main(String[] args) {
        // 创建元素对象
        Keyboard keyboard = new Keyboard("Dell", "机械键盘", 399);
        Monitor monitor = new Monitor("LG", "2K分辨率", 1299);
        Mouse mouse = new Mouse("Logitech", "无线鼠标", 199);
        
        // 创建对象结构并添加元素
        ComputerParts computerParts = new ComputerParts();
        computerParts.addElement(keyboard);
        computerParts.addElement(monitor);
        computerParts.addElement(mouse);
        
        System.out.println("===== 演示访问者模式 =====\n");
        
        // 使用价格访问者计算总价
        System.out.println("1. 使用价格访问者计算电脑配件总价格：");
        PriceVisitor priceVisitor = new PriceVisitor();
        computerParts.accept(priceVisitor);
        System.out.println("电脑配件总价格: " + priceVisitor.getTotalPrice() + " 元\n");
        
        // 使用显示访问者显示详细信息
        System.out.println("2. 使用显示访问者查看电脑配件详细信息：");
        DisplayVisitor displayVisitor = new DisplayVisitor();
        computerParts.accept(displayVisitor);
        
        System.out.println("\n===== 访问者模式解析 =====\n");
        
        System.out.println("1. 核心组件：");
        System.out.println("   - Element（元素）：定义接受访问者的接口，如Element接口");
        System.out.println("   - ConcreteElement（具体元素）：实现接受访问者的方法，如Keyboard、Monitor、Mouse");
        System.out.println("   - Visitor（访问者）：定义对各种元素访问的接口，如Visitor接口");
        System.out.println("   - ConcreteVisitor（具体访问者）：实现访问者接口中定义的方法，如PriceVisitor、DisplayVisitor");
        System.out.println("   - ObjectStructure（对象结构）：管理元素集合，允许访问者遍历元素，如ComputerParts\n");
        
        System.out.println("2. 优点：");
        System.out.println("   - 符合单一职责原则，每个访问者职责明确");
        System.out.println("   - 增加新的操作变得容易，只需创建新的访问者类");
        System.out.println("   - 无需修改元素类就能定义新的操作");
        System.out.println("   - 元素类与操作分离，符合开闭原则\n");
        
        System.out.println("3. 缺点：");
        System.out.println("   - 如果元素类经常变化，会导致修改大量访问者代码");
        System.out.println("   - 访问者可能需要访问元素的内部状态，破坏封装性");
        System.out.println("   - 元素类和访问者类之间的耦合度较高\n");
        
        System.out.println("4. 应用场景：");
        System.out.println("   - 对象结构相对稳定，但操作经常变化的情况");
        System.out.println("   - 需要对多个不同对象类型执行不同操作，而不希望这些操作污染对象类的情况");
        System.out.println("   - 需要对一个复杂对象结构进行多种不同且不相关的操作，而不希望这些操作" +
                           "改变对象的类");
    }
}
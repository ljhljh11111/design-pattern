package com.example;

import com.example.pattern.Builder;
import com.example.pattern.ConcreteBuilder;
import com.example.pattern.Director;
import com.example.pattern.Product;

/**
 * 客户端类 - 演示建造者模式的使用
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== 建造者模式示例 =====");
        
        // 创建建造者
        Builder builder = new ConcreteBuilder();
        
        // 创建指导者，传入建造者
        Director director = new Director(builder);
        
        // 按照标准流程构建产品
        System.out.println("\n构建标准产品：");
        director.constructStandard();
        Product standardProduct = builder.getResult();
        standardProduct.show();
        
        // 创建新的建造者用于构建简化产品
        builder = new ConcreteBuilder();
        director.setBuilder(builder);
        
        // 按照简化流程构建产品
        System.out.println("\n构建简化产品：");
        director.constructSimplified();
        Product simplifiedProduct = builder.getResult();
        simplifiedProduct.show();
        
        // 演示直接使用建造者（不通过指导者）
        System.out.println("\n直接使用建造者自定义构建产品：");
        builder = new ConcreteBuilder();
        builder.buildPartB();
        builder.buildPartA();
        Product customProduct = builder.getResult();
        customProduct.show();
        
        System.out.println("\n===== 建造者模式解析 =====");
        System.out.println("1. 建造者模式将一个复杂对象的构建与它的表示分离");
        System.out.println("2. 核心组件：");
        System.out.println("   - 产品(Product)：被构建的复杂对象");
        System.out.println("   - 建造者(Builder)：定义构建产品各部件的抽象接口");
        System.out.println("   - 具体建造者(ConcreteBuilder)：实现Builder接口");
        System.out.println("   - 指导者(Director)：控制构建流程");
        System.out.println("3. 优点：");
        System.out.println("   - 分离复杂对象的构建和表示");
        System.out.println("   - 同一构建过程可以创建不同的表示");
        System.out.println("   - 便于控制构建过程的细节");
        System.out.println("4. 典型应用场景：");
        System.out.println("   - 创建复杂对象，对象由多个部件组成");
        System.out.println("   - 对象的构建过程独立于其表示");
        System.out.println("   - 需要生成不同表示的产品");
    }
}
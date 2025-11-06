package com.example;

import com.example.pattern.CPU;
import com.example.pattern.HardDrive;
import com.example.pattern.Memory;
import com.example.pattern.ComputerFacade;

/**
 * 客户端类 - 演示外观模式的使用
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== 外观模式示例 =====");
        
        System.out.println("\n1. 不使用外观模式，直接操作子系统组件：");
        testWithoutFacade();
        
        System.out.println("\n2. 使用外观模式，通过外观类操作子系统：");
        testWithFacade();
        
        System.out.println("\n===== 外观模式解析 =====");
        System.out.println("1. 外观模式提供了一个统一的接口，用来访问子系统中的一群接口");
        System.out.println("2. 核心组件：");
        System.out.println("   - 外观(Facade)：提供简化接口，封装子系统的复杂交互");
        System.out.println("   - 子系统(Subsystems)：实现子系统的功能，处理外观类指派的任务");
        System.out.println("3. 优点：");
        System.out.println("   - 降低了客户端与子系统的耦合度");
        System.out.println("   - 简化了客户端的使用，不需要了解子系统的复杂实现");
        System.out.println("   - 更好地划分了系统层次");
        System.out.println("   - 提高了安全性，客户端只能访问外观类提供的接口");
        System.out.println("4. 缺点：");
        System.out.println("   - 增加了系统的抽象层次");
        System.out.println("   - 如果外观类设计不当，可能会成为一个难以维护的巨型类");
        System.out.println("5. 应用场景：");
        System.out.println("   - 当你需要为复杂子系统提供一个简单接口时");
        System.out.println("   - 当客户端与多个子系统存在很大耦合时");
        System.out.println("   - 当你需要构建一个层次结构的子系统时");
    }
    
    /**
     * 不使用外观模式的测试方法
     * 客户端需要了解所有子系统组件及其交互顺序
     */
    private static void testWithoutFacade() {
        System.out.println("手动初始化各个组件并协调它们的工作：");
        
        // 客户端需要直接创建并管理所有子系统组件
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();
        
        // 客户端需要知道正确的操作顺序
        cpu.start();
        memory.initialize();
        hardDrive.start();
        
        // 客户端需要手动处理组件之间的交互
        byte[] bootData = hardDrive.readWriteSector(0, null);
        memory.access(1000, "引导数据");
        cpu.execute("启动系统");
        
        System.out.println("手动操作完成");
        
        // 客户端还需要手动关闭组件
        memory.cleanup();
        hardDrive.stop();
        cpu.shutdown();
    }
    
    /**
     * 使用外观模式的测试方法
     * 客户端只需要与外观类交互，不需要了解子系统的复杂实现
     */
    private static void testWithFacade() {
        // 客户端只需要创建外观类对象
        ComputerFacade computer = new ComputerFacade();
        
        // 客户端通过简单的接口方法使用子系统，不需要了解内部实现细节
        computer.startComputer();
        computer.getComputerStatus();
        computer.runProgram("文本编辑器");
        computer.runProgram("浏览器");
        computer.shutdownComputer();
    }
}
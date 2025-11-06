package com.example.pattern;

/**
 * 外观类 - 为复杂子系统提供一个简单的接口
 * 封装了CPU、内存和硬盘等子系统的复杂交互
 */
public class ComputerFacade {
    // 持有子系统组件的引用
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;
    
    /**
     * 构造方法，初始化子系统组件
     */
    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }
    
    /**
     * 启动计算机 - 简化的接口方法，封装了多个子系统的复杂交互
     */
    public void startComputer() {
        System.out.println("\n开始启动计算机...");
        
        // 按照正确的顺序调用子系统组件的方法
        cpu.start();
        memory.initialize();
        hardDrive.start();
        
        // 加载引导扇区
        System.out.println("加载引导扇区...");
        byte[] bootSector = hardDrive.readWriteSector(0, null);
        memory.access(1000, "引导程序");
        cpu.execute("执行引导程序");
        
        System.out.println("计算机启动完成！");
    }
    
    /**
     * 关闭计算机 - 简化的接口方法
     */
    public void shutdownComputer() {
        System.out.println("\n开始关闭计算机...");
        
        // 按照正确的顺序关闭子系统
        memory.cleanup();
        hardDrive.stop();
        cpu.shutdown();
        
        System.out.println("计算机已安全关闭！");
    }
    
    /**
     * 运行程序 - 简化的接口方法
     * @param programName 程序名称
     */
    public void runProgram(String programName) {
        System.out.println("\n运行程序: " + programName);
        
        // 模拟运行程序的复杂过程
        System.out.println("从硬盘加载程序...");
        byte[] programData = hardDrive.readWriteSector(10, null);
        
        System.out.println("将程序加载到内存...");
        memory.access(2000, programName + " 数据");
        
        System.out.println("CPU执行程序...");
        cpu.execute("运行 " + programName);
        
        System.out.println("程序 " + programName + " 运行完成！");
    }
    
    /**
     * 获取计算机状态信息 - 简化的接口方法
     */
    public void getComputerStatus() {
        System.out.println("\n获取计算机状态信息：");
        System.out.println("CPU: 运行中");
        System.out.println("内存: 已初始化");
        System.out.println("硬盘: 已启动");
        
        // 读取一些示例数据以验证系统正常工作
        String memData = memory.access(1000, null);
        System.out.println("内存状态: " + memData);
    }
}
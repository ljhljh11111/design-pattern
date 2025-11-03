package com.example;

import com.example.pattern.*;

public class Main {
    public static void main(String[] args) {
        // 1. 创建控制台日志工厂，通过工厂获取控制台日志实例
        LoggerFactory consoleFactory = new ConsoleLoggerFactory();
        Logger consoleLogger = consoleFactory.createLogger();
        consoleLogger.log("用户登录成功"); // 输出：控制台日志: 用户登录成功

        // 2. 创建文件日志工厂，通过工厂获取文件日志实例
        LoggerFactory fileFactory = new FileLoggerFactory();
        Logger fileLogger = fileFactory.createLogger();
        fileLogger.log("系统异常，请检查"); // 输出：文件日志: 系统异常，请检查（已写入日志文件）
    }
}

/*
模式解析
产品接口（Logger）：定义所有产品的通用行为，保证产品的一致性。
具体产品（ConsoleLogger、FileLogger）：实现产品接口，提供具体功能。
工厂接口（LoggerFactory）：声明创建产品的工厂方法，抽象出创建逻辑。
具体工厂（ConsoleLoggerFactory、FileLoggerFactory）：实现工厂接口，负责创建对应的具体产品，包含产品的初始化逻辑。
客户端（Client）：通过工厂接口获取产品，无需关心产品的具体创建过程，符合 “依赖倒置原则”（依赖抽象，不依赖具体）。
优点
解耦：客户端与具体产品分离，只需通过工厂接口获取产品，无需知道产品的实现细节。
扩展性强：新增产品时，只需新增对应的具体产品类和具体工厂类，无需修改现有代码（符合 “开闭原则”）。
责任清晰：工厂类负责创建产品，产品类负责实现业务逻辑，职责单一。
如果需要新增一种 “数据库日志”，只需添加 DatabaseLogger（具体产品）和 DatabaseLoggerFactory（具体工厂），客户端代码无需修改即可使用，扩展性非常灵活。
*/

package com.example;

import com.example.pattern.GeneralManager;
import com.example.pattern.Handler;
import com.example.pattern.Manager;
import com.example.pattern.Request;
import com.example.pattern.TeamLeader;

/**
 * 客户端类 - 演示责任链模式的使用
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== 责任链模式示例 =====");
        
        // 创建责任链中的各个处理者
        Handler teamLeader = new TeamLeader("张组长");
        Handler manager = new Manager("李经理");
        Handler generalManager = new GeneralManager("王总经理");
        
        // 构建责任链：团队领导 -> 项目经理 -> 总经理
        teamLeader.setNextHandler(manager).setNextHandler(generalManager);
        
        System.out.println("\n1. 测试短期请假请求（2天）：");
        Request leaveRequest1 = new Request(Request.RequestType.LEAVE, "身体不适需要请假", 2, "张三");
        boolean result1 = teamLeader.handleRequest(leaveRequest1);
        System.out.println("请求处理结果: " + (result1 ? "成功" : "失败") + "\n");
        
        System.out.println("2. 测试中期请假请求（5天）：");
        Request leaveRequest2 = new Request(Request.RequestType.LEAVE, "家中有事需要请假", 5, "李四");
        boolean result2 = teamLeader.handleRequest(leaveRequest2);
        System.out.println("请求处理结果: " + (result2 ? "成功" : "失败") + "\n");
        
        System.out.println("3. 测试长期请假请求（10天）：");
        Request leaveRequest3 = new Request(Request.RequestType.LEAVE, "出国旅游需要请假", 10, "王五");
        boolean result3 = teamLeader.handleRequest(leaveRequest3);
        System.out.println("请求处理结果: " + (result3 ? "成功" : "失败") + "\n");
        
        System.out.println("4. 测试薪资调整请求：");
        Request salaryRequest = new Request(Request.RequestType.SALARY, "工作表现优秀，申请加薪", "赵六");
        boolean result4 = teamLeader.handleRequest(salaryRequest);
        System.out.println("请求处理结果: " + (result4 ? "成功" : "失败") + "\n");
        
        System.out.println("5. 测试辞职请求：");
        Request resignationRequest = new Request(Request.RequestType.RESIGNATION, "个人发展原因申请辞职", "钱七");
        boolean result5 = teamLeader.handleRequest(resignationRequest);
        System.out.println("请求处理结果: " + (result5 ? "成功" : "失败") + "\n");
        
        System.out.println("===== 责任链模式解析 =====");
        System.out.println("1. 责任链模式允许多个对象处理同一个请求，而客户端无需知道具体由哪个对象处理");
        System.out.println("2. 核心组件：");
        System.out.println("   - 抽象处理者(Handler)：定义处理请求的接口，包含对下一个处理者的引用");
        System.out.println("   - 具体处理者(ConcreteHandler)：实现处理请求的方法，判断是否能处理该请求");
        System.out.println("   - 请求类(Request)：包含请求的相关信息");
        System.out.println("3. 优点：");
        System.out.println("   - 降低了请求的发送者和接收者之间的耦合度");
        System.out.println("   - 增强了系统的可扩展性，可以灵活地增加新的处理者");
        System.out.println("   - 简化了对象的职责，每个处理者只需要关注自己能处理的请求");
        System.out.println("   - 符合单一职责原则和开闭原则");
        System.out.println("4. 缺点：");
        System.out.println("   - 请求可能会经过责任链上的多个处理者，影响系统性能");
        System.out.println("   - 如果责任链构建不当，可能导致请求得不到处理");
        System.out.println("5. 应用场景：");
        System.out.println("   - 有多个对象可以处理同一个请求，具体哪个对象处理由运行时决定");
        System.out.println("   - 不明确指定接收者的情况下，向多个对象中的一个提交请求");
        System.out.println("   - 可动态指定一组对象处理请求");
        System.out.println("   - 典型应用：日志记录、异常处理、审批流程等");
    }
}
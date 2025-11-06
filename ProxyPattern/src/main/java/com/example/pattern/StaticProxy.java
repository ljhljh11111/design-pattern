package com.example.pattern;

/**
 * 静态代理类 - 实现Subject接口，持有RealSubject对象的引用
 * 在调用真实主题方法前后可以添加额外的处理逻辑
 */
public class StaticProxy implements Subject {
    // 持有真实主题的引用
    private Subject realSubject;
    
    /**
     * 构造方法，接收真实主题对象
     * @param realSubject 真实主题对象
     */
    public StaticProxy(Subject realSubject) {
        this.realSubject = realSubject;
    }
    
    /**
     * 实现请求方法，在调用真实主题前后添加额外逻辑
     */
    @Override
    public void request() {
        // 前置处理
        System.out.println("StaticProxy: 调用前的准备工作");
        System.out.println("StaticProxy: 记录日志 - 开始请求");
        
        // 调用真实主题的方法
        long startTime = System.currentTimeMillis();
        realSubject.request();
        long endTime = System.currentTimeMillis();
        
        // 后置处理
        System.out.println("StaticProxy: 记录日志 - 请求结束，耗时: " + (endTime - startTime) + "ms");
        System.out.println("StaticProxy: 调用后的清理工作");
    }
    
    /**
     * 实现带参数的请求方法，同样可以添加额外逻辑
     */
    @Override
    public String requestWithParam(String param) {
        // 前置处理 - 参数校验
        if (param == null || param.trim().isEmpty()) {
            System.out.println("StaticProxy: 参数校验失败，参数不能为空");
            return "错误: 参数无效";
        }
        
        System.out.println("StaticProxy: 参数校验通过，开始处理请求");
        
        // 调用真实主题的方法
        String result = realSubject.requestWithParam(param);
        
        // 后置处理 - 结果处理
        System.out.println("StaticProxy: 请求处理完成，结果为: " + result);
        
        return result;
    }
}
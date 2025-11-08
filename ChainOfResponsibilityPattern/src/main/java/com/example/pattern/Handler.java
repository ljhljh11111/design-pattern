package com.example.pattern;

/**
 * 处理者抽象类 - 定义处理请求的接口
 * 在责任链模式中，每个处理者都包含对下一个处理者的引用
 */
public abstract class Handler {
    protected Handler nextHandler;  // 后继处理者
    protected String name;          // 处理者名称
    
    /**
     * 构造方法
     * @param name 处理者名称
     */
    public Handler(String name) {
        this.name = name;
    }
    
    /**
     * 设置后继处理者
     * @param nextHandler 下一个处理者
     * @return 返回后继处理者，支持链式调用
     */
    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;  // 返回nextHandler以支持链式设置
    }
    
    /**
     * 处理请求的抽象方法
     * @param request 请求对象
     * @return 是否成功处理
     */
    public abstract boolean handleRequest(Request request);
    
    /**
     * 处理请求的模板方法
     * 在子类中实现handleRequest时可以调用此方法传递给下一个处理者
     * @param request 请求对象
     * @return 是否成功处理
     */
    protected boolean passToNext(Request request) {
        if (nextHandler != null) {
            System.out.println(name + " 将请求传递给 " + nextHandler.name);
            return nextHandler.handleRequest(request);
        } else {
            System.out.println(name + "：没有后续处理者，请求无法处理");
            return false;
        }
    }
    
    /**
     * 获取处理者名称
     * @return 处理者名称
     */
    public String getName() {
        return name;
    }
}
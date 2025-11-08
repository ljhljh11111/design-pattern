package com.example.pattern;

/**
 * 团队领导 - 具体处理者类
 * 能够处理简单的请求，如短期请假
 */
public class TeamLeader extends Handler {
    
    /**
     * 构造方法
     */
    public TeamLeader(String name) {
        super(name);
    }
    
    /**
     * 处理请求的方法
     * 团队领导可以处理1-3天的请假请求
     */
    @Override
    public boolean handleRequest(Request request) {
        System.out.println(name + " 收到请求：" + request);
        
        // 根据请求类型和条件判断是否可以处理
        if (request.getType() == Request.RequestType.LEAVE) {
            // 团队领导可以批准1-3天的请假
            if (request.getDays() >= 1 && request.getDays() <= 3) {
                System.out.println(name + " 批准了 " + request.getRequester() + " 的 " + 
                                   request.getDays() + " 天请假请求");
                return true;
            } else {
                System.out.println(name + " 无法批准超过3天的请假请求");
                // 传递给下一个处理者
                return passToNext(request);
            }
        } else {
            // 不是请假请求，传递给下一个处理者
            System.out.println(name + " 无法处理类型为 " + request.getType() + " 的请求");
            return passToNext(request);
        }
    }
}
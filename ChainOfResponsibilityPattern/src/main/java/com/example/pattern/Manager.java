package com.example.pattern;

/**
 * 项目经理 - 具体处理者类
 * 能够处理中等复杂度的请求，如较长时间的请假和小型薪资调整
 */
public class Manager extends Handler {
    
    /**
     * 构造方法
     */
    public Manager(String name) {
        super(name);
    }
    
    /**
     * 处理请求的方法
     * 项目经理可以处理3-7天的请假请求和小型薪资调整
     */
    @Override
    public boolean handleRequest(Request request) {
        System.out.println(name + " 收到请求：" + request);
        
        if (request.getType() == Request.RequestType.LEAVE) {
            // 项目经理可以批准3-7天的请假
            if (request.getDays() > 3 && request.getDays() <= 7) {
                System.out.println(name + " 批准了 " + request.getRequester() + " 的 " + 
                                   request.getDays() + " 天请假请求");
                return true;
            } else if (request.getDays() > 7) {
                System.out.println(name + " 无法批准超过7天的请假请求");
                // 传递给下一个处理者
                return passToNext(request);
            } else {
                // 1-3天的请假应该由团队领导处理
                return passToNext(request);
            }
        } else if (request.getType() == Request.RequestType.SALARY) {
            // 项目经理可以处理小型薪资调整
            System.out.println(name + " 处理了 " + request.getRequester() + " 的薪资调整请求：" + 
                               request.getContent());
            System.out.println("项目经理审批：薪资调整幅度在允许范围内，批准处理");
            return true;
        } else {
            // 不是请假或薪资调整请求，传递给下一个处理者
            System.out.println(name + " 无法处理类型为 " + request.getType() + " 的请求");
            return passToNext(request);
        }
    }
}
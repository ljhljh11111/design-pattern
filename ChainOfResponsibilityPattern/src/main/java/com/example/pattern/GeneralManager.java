package com.example.pattern;

/**
 * 总经理 - 具体处理者类
 * 能够处理复杂或重大的请求，如长期请假和辞职
 */
public class GeneralManager extends Handler {
    
    /**
     * 构造方法
     */
    public GeneralManager(String name) {
        super(name);
    }
    
    /**
     * 处理请求的方法
     * 总经理可以处理超过7天的请假请求和辞职请求
     */
    @Override
    public boolean handleRequest(Request request) {
        System.out.println(name + " 收到请求：" + request);
        
        if (request.getType() == Request.RequestType.LEAVE) {
            // 总经理可以批准超过7天的请假
            if (request.getDays() > 7) {
                System.out.println(name + " 批准了 " + request.getRequester() + " 的 " + 
                                   request.getDays() + " 天长期请假请求");
                System.out.println("总经理审批：长期请假需要安排工作交接");
                return true;
            } else {
                // 7天以内的请假应该由下级处理
                return passToNext(request);
            }
        } else if (request.getType() == Request.RequestType.RESIGNATION) {
            // 总经理处理辞职请求
            System.out.println(name + " 处理了 " + request.getRequester() + " 的辞职请求：" + 
                               request.getContent());
            System.out.println("总经理审批：批准辞职，安排离职手续");
            return true;
        } else if (request.getType() == Request.RequestType.SALARY) {
            // 总经理可以处理大型薪资调整
            System.out.println(name + " 处理了 " + request.getRequester() + " 的大型薪资调整请求：" + 
                               request.getContent());
            System.out.println("总经理审批：大型薪资调整需要人事部门备案");
            return true;
        } else {
            // 未知类型的请求
            System.out.println(name + " 无法识别的请求类型");
            return false;
        }
    }
}
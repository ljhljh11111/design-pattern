package com.example.pattern;

/**
 * 请求类 - 封装请求的信息
 * 在责任链模式中，请求沿着处理者链传递
 */
public class Request {
    // 请求类型枚举
    public enum RequestType {
        LEAVE,       // 请假
        SALARY,      // 薪资调整
        RESIGNATION  // 辞职
    }
    
    private RequestType type;  // 请求类型
    private String content;    // 请求内容
    private int days;          // 天数（如请假天数）
    private String requester;  // 请求人
    
    /**
     * 构造方法
     * @param type 请求类型
     * @param content 请求内容
     * @param requester 请求人
     */
    public Request(RequestType type, String content, String requester) {
        this.type = type;
        this.content = content;
        this.requester = requester;
    }
    
    /**
     * 构造方法（带天数）
     * @param type 请求类型
     * @param content 请求内容
     * @param days 天数
     * @param requester 请求人
     */
    public Request(RequestType type, String content, int days, String requester) {
        this.type = type;
        this.content = content;
        this.days = days;
        this.requester = requester;
    }
    
    // Getter和Setter方法
    public RequestType getType() {
        return type;
    }
    
    public void setType(RequestType type) {
        this.type = type;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public int getDays() {
        return days;
    }
    
    public void setDays(int days) {
        this.days = days;
    }
    
    public String getRequester() {
        return requester;
    }
    
    public void setRequester(String requester) {
        this.requester = requester;
    }
    
    @Override
    public String toString() {
        return "Request{" +
                "type=" + type +
                ", content='" + content + '\'' +
                ", days=" + days +
                ", requester='" + requester + '\'' +
                '}';
    }
}
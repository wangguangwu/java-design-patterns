package com.wangguangwu.chain.product;

/**
 * 审批请求类
 * <p>
 * 这是审批请求类，包含请求信息
 *
 * @author wangguangwu
 */
public class Request {

    private final String type;
    private final double amount;
    private final String description;

    /**
     * 构造函数
     *
     * @param type        请求类型
     * @param amount      请求金额
     * @param description 请求描述
     */
    public Request(String type, double amount, String description) {
        this.type = type;
        this.amount = amount;
        this.description = description;
    }

    /**
     * 获取请求类型
     *
     * @return 请求类型
     */
    public String getType() {
        return type;
    }

    /**
     * 获取请求金额
     *
     * @return 请求金额
     */
    public double getAmount() {
        return amount;
    }

    /**
     * 获取请求描述
     *
     * @return 请求描述
     */
    public String getDescription() {
        return description;
    }
}
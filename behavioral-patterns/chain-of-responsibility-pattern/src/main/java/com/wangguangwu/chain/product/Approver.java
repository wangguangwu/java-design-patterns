package com.wangguangwu.chain.product;

/**
 * 审批者接口
 * <p>
 * 这是审批者接口，定义了审批的基本方法
 *
 * @author wangguangwu
 */
public interface Approver {

    /**
     * 设置下一个审批者
     *
     * @param nextApprover 下一个审批者
     */
    void setNextApprover(Approver nextApprover);

    /**
     * 处理审批
     *
     * @param request 审批请求
     * @return 是否处理完成
     */
    boolean processRequest(Request request);

}

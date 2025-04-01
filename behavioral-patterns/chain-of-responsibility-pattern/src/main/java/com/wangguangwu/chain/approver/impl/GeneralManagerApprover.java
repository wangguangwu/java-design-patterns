package com.wangguangwu.chain.approver.impl;

import com.wangguangwu.chain.approver.Approver;
import com.wangguangwu.chain.request.Request;

/**
 * 总经理审批者
 * <p>
 * 这是总经理审批者，负责处理金额在 5000 以上的请求
 *
 * @author wangguangwu
 */
public class GeneralManagerApprover implements Approver {

    private Approver nextApprover;

    @Override
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public boolean processRequest(Request request) {
        System.out.printf(
                "总经理审批者处理请求：\n类型：%s\n金额：%.2f\n描述：%s%n",
                request.getType(),
                request.getAmount(),
                request.getDescription()
        );

        // 总经理处理所有类型的请求
        System.out.println("总经理审批完成，审批流程结束");
        // 不需要继续审批
        return false;
    }
}

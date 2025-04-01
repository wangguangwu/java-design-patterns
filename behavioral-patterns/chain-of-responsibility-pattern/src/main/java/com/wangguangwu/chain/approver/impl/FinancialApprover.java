package com.wangguangwu.chain.approver.impl;

import com.wangguangwu.chain.approver.Approver;
import com.wangguangwu.chain.request.Request;

/**
 * 财务审批者
 * <p>
 * 这是财务审批者，负责处理金额在 1000 以下的请求
 *
 * @author wangguangwu
 */
public class FinancialApprover implements Approver {

    private Approver nextApprover;

    @Override
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public boolean processRequest(Request request) {
        System.out.printf(
                "财务审批者处理请求：\n类型：%s\n金额：%.2f\n描述：%s%n",
                request.getType(),
                request.getAmount(),
                request.getDescription()
        );

        if ("报销".equals(request.getType())) {
            if (request.getAmount() <= 1000) {
                System.out.println("财务审批完成，金额在1000以内，无需继续审批");
                return false;
            } else {
                System.out.println("报销金额超过1000，需要继续审批");
                if (nextApprover != null) {
                    return nextApprover.processRequest(request);
                }
                return true;
            }
        }

        // 继续审批
        if (nextApprover != null) {
            return nextApprover.processRequest(request);
        }
        return true;
    }
}

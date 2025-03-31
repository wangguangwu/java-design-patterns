package com.wangguangwu.chain.product.impl;

import com.wangguangwu.chain.product.Approver;
import com.wangguangwu.chain.product.Request;

/**
 * 经理审批者
 * <p>
 * 这是经理审批者，负责处理金额在 1000 到 5000 之间的请求
 *
 * @author wangguangwu
 */
public class ManagerApprover implements Approver {

    private Approver nextApprover;

    @Override
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public boolean processRequest(Request request) {
        System.out.printf(
                "经理审批者处理请求：\n类型：%s\n金额：%.2f\n描述：%s%n",
                request.getType(),
                request.getAmount(),
                request.getDescription()
        );

        // 经理处理采购和投资请求
        if ("采购".equals(request.getType()) || "投资".equals(request.getType())) {
            if (request.getAmount() <= 5000) {
                System.out.println("经理审批完成，金额在5000以内，无需继续审批");
                return false;
            } else {
                System.out.println("金额超过5000，需要继续审批");
                if (nextApprover != null) {
                    return nextApprover.processRequest(request);
                }
                return true;
            }
        }

        // 其他类型的请求需要继续审批
        if (nextApprover != null) {
            return nextApprover.processRequest(request);
        }
        return true;
    }
}

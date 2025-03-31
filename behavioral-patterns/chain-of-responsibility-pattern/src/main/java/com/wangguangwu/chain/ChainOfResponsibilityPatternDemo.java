package com.wangguangwu.chain;

import com.wangguangwu.chain.product.Approver;
import com.wangguangwu.chain.product.Request;
import com.wangguangwu.chain.product.impl.FinancialApprover;
import com.wangguangwu.chain.product.impl.GeneralManagerApprover;
import com.wangguangwu.chain.product.impl.ManagerApprover;

/**
 * 责任链模式演示类
 * <p>
 * 责任链模式（Chain of Responsibility Pattern）是一种行为型设计模式，它允许你将请求沿着处理者链进行发送。
 * 收到请求后，每个处理者都可以处理请求或将其传递给链上的下一个处理者。
 * <p>
 * 主要优点：
 * 1. 减少了请求的处理者
 * 2. 增强了给对象指派职责的灵活性
 * 3. 实现了请求发送者和接收者之间的解耦
 * <p>
 * 主要缺点：
 * 1. 不能保证请求一定被接收
 * 2. 系统性能将受到一定影响
 * 3. 可能造成循环调用
 * <p>
 * 适用场景：
 * 1. 有多个对象可以处理同一个请求
 * 2. 需要根据条件选择处理者
 * 3. 需要动态指定处理者
 *
 * @author wangguangwu
 */
public class ChainOfResponsibilityPatternDemo {

    public static void main(String[] args) {
        // 创建审批者
        Approver financialApprover = new FinancialApprover();
        Approver managerApprover = new ManagerApprover();
        Approver generalManagerApprover = new GeneralManagerApprover();

        // 构建审批链
        financialApprover.setNextApprover(managerApprover);
        managerApprover.setNextApprover(generalManagerApprover);

        // 处理不同金额的请求
        System.out.println("处理不同金额的请求：");

        // 金额 800 的请求
        Request request1 = new Request("报销", 800, "差旅费报销");
        System.out.println("\n请求 1：");
        financialApprover.processRequest(request1);

        // 金额 3000 的请求
        Request request2 = new Request("采购", 3000, "办公用品采购");
        System.out.println("\n请求 2：");
        financialApprover.processRequest(request2);

        // 金额 10000 的请求
        Request request3 = new Request("投资", 10000, "项目投资申请");
        System.out.println("\n请求 3：");
        financialApprover.processRequest(request3);
    }
}

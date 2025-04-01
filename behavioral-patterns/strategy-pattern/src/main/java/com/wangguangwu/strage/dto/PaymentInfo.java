package com.wangguangwu.strage.dto;

/**
 * 支付信息类
 * <p>
 * 这是支付信息类，包含支付相关的所有信息
 *
 * @author wangguangwu
 */
public class PaymentInfo {

    // 支付类型（信用卡、银行转账、钱包）
    private final String type;
    // 账号
    private final String account;
    // 持有人
    private final String name;
    // 有效期（信用卡）
    private final String expiry;
    // 安全码（信用卡）
    private final String cvv;
    // 银行名称（银行转账）
    private final String bank;
    // 手机号（钱包）
    private final String phoneNumber;

    /**
     * 构造函数
     *
     * @param type        支付类型
     * @param account     账号
     * @param name        持有人
     * @param expiry      有效期
     * @param cvv         安全码
     * @param bank        银行名称
     * @param phoneNumber 手机号
     */
    public PaymentInfo(String type, String account, String name,
                       String expiry, String cvv, String bank,
                       String phoneNumber) {
        this.type = type;
        this.account = account;
        this.name = name;
        this.expiry = expiry;
        this.cvv = cvv;
        this.bank = bank;
        this.phoneNumber = phoneNumber;
    }

    public String getType() {
        return type;
    }

    public String getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public String getExpiry() {
        return expiry;
    }

    public String getCvv() {
        return cvv;
    }

    public String getBank() {
        return bank;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

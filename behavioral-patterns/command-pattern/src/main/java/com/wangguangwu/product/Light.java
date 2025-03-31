package com.wangguangwu.product;

/**
 * 灯光类
 * <p>
 * 这是接收者类，负责执行具体的操作
 *
 * @author wangguangwu
 */
public class Light {

    private boolean isOn;

    /**
     * 打开灯光
     */
    public void on() {
        isOn = true;
    }

    /**
     * 关闭灯光
     */
    public void off() {
        isOn = false;
    }

    /**
     * 获取灯光状态
     *
     * @return 灯光是否开启
     */
    public boolean isOn() {
        return isOn;
    }
}

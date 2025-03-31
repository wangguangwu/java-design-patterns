package com.wangguangwu.product;

/**
 * 空调类
 * <p>
 * 这是接收者类，负责执行具体的操作
 *
 * @author wangguangwu
 */
public class AirConditioner {

    private boolean isOn;
    private int temperature;

    /**
     * 打开空调
     */
    public void on() {
        isOn = true;
    }

    /**
     * 关闭空调
     */
    public void off() {
        isOn = false;
    }

    /**
     * 设置温度
     *
     * @param temperature 温度值
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     * 获取温度
     *
     * @return 温度值
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * 获取空调状态
     *
     * @return 空调是否开启
     */
    public boolean isOn() {
        return isOn;
    }
}

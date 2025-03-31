package com.wangguangwu.product;

/**
 * 产品2：具体的产品类
 * <p>
 * 这个类表示具体的产品，包含多个特征
 *
 * @author wangguangwu
 */
public class Product2 {

    private String componentX;
    private String componentY;
    private String componentZ;

    public String getComponentX() {
        return componentX;
    }

    public void setComponentX(String componentX) {
        this.componentX = componentX;
    }

    public String getComponentY() {
        return componentY;
    }

    public void setComponentY(String componentY) {
        this.componentY = componentY;
    }

    public String getComponentZ() {
        return componentZ;
    }

    public void setComponentZ(String componentZ) {
        this.componentZ = componentZ;
    }

    @Override
    public String toString() {
        return "Product2{" +
                "componentX='" + componentX + '\'' +
                ", componentY='" + componentY + '\'' +
                ", componentZ='" + componentZ + '\'' +
                '}';
    }
}

package com.wangguangwu.product;


/**
 * 产品1：具体的产品类
 * <p>
 * 这个类表示具体的产品，包含多个特征
 *
 * @author wangguangwu
 */
public class Product1 {

    private String featureA;
    private String featureB;
    private String featureZ;

    public String getFeatureA() {
        return featureA;
    }

    public void setFeatureA(String featureA) {
        this.featureA = featureA;
    }

    public String getFeatureB() {
        return featureB;
    }

    public void setFeatureB(String featureB) {
        this.featureB = featureB;
    }

    public String getFeatureZ() {
        return featureZ;
    }

    public void setFeatureZ(String featureZ) {
        this.featureZ = featureZ;
    }

    @Override
    public String toString() {
        return "Product1{" +
                "featureA='" + featureA + '\'' +
                ", featureB='" + featureB + '\'' +
                ", featureZ='" + featureZ + '\'' +
                '}';
    }
}

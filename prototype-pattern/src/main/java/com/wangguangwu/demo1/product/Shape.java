package com.wangguangwu.demo1.product;

import lombok.Data;

/**
 * @author wangguangwu
 */
@Data
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    /**
     * draw
     */
    abstract void draw();

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

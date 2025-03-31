package com.wangguangwu.prototype.impl;

import com.wangguangwu.prototype.Prototype;


/**
 * 具体原型类：实现原型接口的类
 * <p>
 * 这个类实现了原型接口，提供了具体的克隆实现
 *
 * @author wangguangwu
 */
public class ConcretePrototype implements Prototype {

    private String field1;
    private String field2;
    private int field3;
    private boolean field4;
    private String[] field5;

    public ConcretePrototype() {
    }

    public ConcretePrototype(ConcretePrototype prototype) {
        if (prototype != null) {
            this.field1 = prototype.field1;
            this.field2 = prototype.field2;
            this.field3 = prototype.field3;
            this.field4 = prototype.field4;
            // 深拷贝数组
            if (prototype.field5 != null) {
                this.field5 = new String[prototype.field5.length];
                System.arraycopy(prototype.field5, 0, this.field5, 0, prototype.field5.length);
            }
        }
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this);
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public int getField3() {
        return field3;
    }

    public void setField3(int field3) {
        this.field3 = field3;
    }

    public boolean isField4() {
        return field4;
    }

    public void setField4(boolean field4) {
        this.field4 = field4;
    }

    public String[] getField5() {
        return field5;
    }

    public void setField5(String[] field5) {
        this.field5 = field5;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3=" + field3 +
                ", field4=" + field4 +
                ", field5=" + (field5 != null ? field5.length : 0) +
                '}';
    }
}

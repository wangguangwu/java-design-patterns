package com.wangguangwu.prototype.impl;

import com.wangguangwu.prototype.Prototype;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 子类原型，继承自 ConcretePrototype，添加了 field2 字段。
 *
 * @author wangguangwu
 */
@Getter
@Setter
@NoArgsConstructor
public class SubclassPrototype extends ConcretePrototype {

    private String field2;

    public SubclassPrototype(SubclassPrototype prototype) {
        super(prototype);
        if (prototype != null) {
            this.field2 = prototype.field2;
        }
    }

    @Override
    public Prototype clone() {
        return new SubclassPrototype(this);
    }
}

package com.wangguangwu.prototype.impl;

import com.wangguangwu.prototype.Prototype;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 具体原型类，包含字段 field1，并实现克隆方法。
 *
 * @author wangguangwu
 */
@Getter
@Setter
@NoArgsConstructor
public class ConcretePrototype implements Prototype {

    private String field1;

    public ConcretePrototype(ConcretePrototype prototype) {
        if (prototype != null) {
            this.field1 = prototype.field1;
        }
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this);
    }
}

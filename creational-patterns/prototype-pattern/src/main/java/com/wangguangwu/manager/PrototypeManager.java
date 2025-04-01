package com.wangguangwu.manager;

import com.wangguangwu.prototype.Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型管理器：管理原型对象的注册和获取
 * <p>
 * 这个类负责管理原型对象的注册和获取
 *
 * @author wangguangwu
 */
public class PrototypeManager {

    private static final Map<String, Prototype> PROTOTYPE_MAP = new HashMap<>();

    /**
     * 注册原型对象
     *
     * @param name      原型名称
     * @param prototype 原型对象
     */
    public static void registerPrototype(String name, Prototype prototype) {
        PROTOTYPE_MAP.put(name, prototype);
    }

    /**
     * 获取原型对象的克隆
     *
     * @param name 原型名称
     * @return 克隆的对象
     * @throws CloneNotSupportedException 如果原型不存在
     */
    public static Prototype getPrototype(String name) throws CloneNotSupportedException {
        Prototype prototype = PROTOTYPE_MAP.get(name);
        if (prototype == null) {
            throw new CloneNotSupportedException("Prototype not found: " + name);
        }
        return prototype.clone();
    }
}

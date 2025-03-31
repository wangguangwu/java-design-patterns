package com.wangguangwu.memento.memento;


import com.wangguangwu.memento.product.Role;

/**
 * 备忘录接口
 * <p>
 * 这是备忘录接口，用于保存对象的状态
 *
 * @author wangguangwu
 */
public interface Memento {

    /**
     * 获取状态
     *
     * @return 对象状态
     */
    Role getRole();

    /**
     * 恢复状态
     *
     * @param role 角色对象
     */
    void restore(Role role);

}

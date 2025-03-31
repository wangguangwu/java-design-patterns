package com.wangguangwu.composite;

import com.wangguangwu.composite.component.Component;
import com.wangguangwu.composite.component.Leaf;
import com.wangguangwu.composite.composite.Composite;

/**
 * 组合模式演示类
 * <p>
 * 组合模式（Composite Pattern）是一种结构型设计模式，它将对象组合成树形结构以表示"部分-整体"的层次结构。
 * <p>
 * 主要优点：
 * 1. 定义了包含基本对象和组合对象的类层次结构
 * 2. 客户端可以一致地使用组合结构和单个对象
 * 3. 更容易添加新类型的组件
 * <p>
 * 主要缺点：
 * 1. 设计较复杂
 * 2. 不容易限制组件
 * 3. 可能导致设计过大
 * <p>
 * 适用场景：
 * 1. 表示对象的"部分-整体"层次结构
 * 2. 希望用户可以忽略组合对象与单个对象的区别
 * 3. 需要对层次结构中的所有对象进行遍历
 *
 * @author wangguangwu
 */
public class CompositePatternDemo {

    public static void main(String[] args) {
        // 创建根节点
        Component root = new Composite("根节点");

        // 添加叶子节点
        root.add(new Leaf("叶子节点A"));
        root.add(new Leaf("叶子节点B"));

        // 创建组合节点X
        Component compositeX = new Composite("组合节点X");
        compositeX.add(new Leaf("叶子节点XA"));
        compositeX.add(new Leaf("叶子节点XB"));

        // 将组合节点X添加到根节点
        root.add(compositeX);

        // 创建组合节点XY
        Component compositeXY = new Composite("组合节点XY");
        compositeXY.add(new Leaf("叶子节点XYA"));
        compositeXY.add(new Leaf("叶子节点XYB"));

        // 将组合节点XY添加到组合节点X
        compositeX.add(compositeXY);

        // 添加更多叶子节点
        root.add(new Leaf("叶子节点C"));

        // 创建临时叶子节点D
        Component leafD = new Leaf("叶子节点D");
        root.add(leafD);
        root.remove(leafD);

        // 显示树形结构
        System.out.println("显示树形结构：");
        root.display(1);
    }
}
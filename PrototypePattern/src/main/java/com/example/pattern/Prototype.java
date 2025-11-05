package com.example.pattern;

/**
 * 原型接口 - 定义克隆方法
 * 实现Cloneable接口是Java中实现原型模式的标准方式
 */
public interface Prototype extends Cloneable {
    /**
     * 克隆方法
     * @return 克隆出的对象
     */
    Object clone();
}
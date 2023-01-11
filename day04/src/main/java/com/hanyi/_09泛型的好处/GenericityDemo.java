package com.hanyi._09泛型的好处;

import java.util.ArrayList;

/**
 * 目标：泛型的好处。
 * 泛型在编译阶段约束了某种操作类型，从而不会出现类型转换异常。
 * 主要体现的是Java的严谨性和规范性，数据类型，经常需要进行统一！
 */
public class GenericityDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("123");
        list.add(123);
    }
}

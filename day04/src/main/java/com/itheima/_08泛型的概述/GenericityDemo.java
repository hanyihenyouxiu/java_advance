package com.itheima._08泛型的概述;

import java.util.ArrayList;

/**
 * 目标：泛型的概述。
 *
 * 什么是泛型？
 *      泛型就是一个标签：<数据类型>
 *      泛型可以在编译阶段约束只能操作某种数据类型。
 * 注意：
 *      JDK1.7开始之后，泛型后面的申明可以省略不写！
 *      泛型和集合都只能支持引用数据类型，不支持基本数据类型。
 *
 * 小结：
 *      泛型是一个标签，可以在编译阶段约束只能操作某种数据类型。
 *      泛型和集合都只支持引用数据类型，不支持基本数据类型。
 */
public class GenericityDemo {
    public static void main(String[] args) {
        // 不加泛型任何类型都可以
        ArrayList list = new ArrayList();
        list.add("1");
        list.add(1);
        System.out.println(list);
    }
}

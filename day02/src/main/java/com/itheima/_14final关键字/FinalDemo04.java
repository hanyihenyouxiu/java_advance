package com.itheima._14final关键字;

/**
 * 目标：final修饰实例成员变量（了解，用不到）
 * <p>
 * final修饰变量的总规则：有且仅能被赋值一次。
 * <p>
 * 拓展：
 *  final修饰实例成员变量可以在哪些地方赋值一次。
 *      1.定义的时候赋值一次。
 *      2.可以在实例代码块中赋值一次。
 *      3.可以在每个构造器中赋值一次。
 */
public class FinalDemo04 {

    private final String name = "黑马";
    private final String name1;
    private final String name2;

    {
        name1 = "黑马1";
    }

    FinalDemo04(String name) {
        this.name2 = name;
    }

    public static void main(String[] args) {

    }
}

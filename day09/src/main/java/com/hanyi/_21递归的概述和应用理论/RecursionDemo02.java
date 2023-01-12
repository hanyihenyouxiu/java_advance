package com.hanyi._21递归的概述和应用理论;

/**
 * 目标：递归的核心算法思想和执行流程
 *
 * 已知：f(x) = f(x-1) + 1
 * 已知：f(1) = 1
 * 求   f(10) = ?
 *      f(100) = ?
 *      f(1000) = ?
 *
 * 递归算法的三要素：
 *  1.递归的公式
 *  2.递归的终结点
 *  3.递归的方法：必须走向终结点。
 */
public class RecursionDemo02 {
    public static void main(String[] args) {
        System.out.println(f(100));
        System.out.println(f1(100));
    }

    public static int f(int x) {
        return x == 1 ? 1 : f(x - 1) + 1;
    }

    public static int f1(int x) {
        if (x == 1) {
            return 1;
        }

        return f(x - 1) + 1;
    }
}

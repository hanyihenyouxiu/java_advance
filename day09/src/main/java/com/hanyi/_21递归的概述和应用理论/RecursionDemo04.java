package com.hanyi._21递归的概述和应用理论;

/**
 * f(x) = 1.5x + 1
 * f(1) = 1.5 * 1 + 1
 * f(2) = 1.5 * 2 + 1
 * 递归三要素：
 *      公式：
 *      终结点：
 *      递归的方向：
 */
public class RecursionDemo04 {
    public static void main(String[] args) {
        System.out.println(f(10));
    }

    public static double f(double x) {
        if (x == 1) {
            return 2.5;
        } else {
            return 1.5 + f(x - 1);
        }
    }
}

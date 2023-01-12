package com.hanyi._21递归的概述和应用理论;

/**
 * f(x) = f(x-1) * 1.5 + y
 * f(1) = 1.5 + y
 */
public class RecursionDemo04 {
    public static void main(String[] args) {
        System.out.println(f(10, 0.5));
    }

    public static double f(double x, double y) {
        return 1;
    }
}

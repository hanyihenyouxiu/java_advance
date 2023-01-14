package com.hanyi._21递归的概述和应用理论;

/**
 *
 */
public class RecursionDemo06 {
    public static void main(String[] args) {
        System.out.println(f(10));
    }

    public static int f(int x) {
        return x == 1 ? 1 : f(x - 1) * x;
    }
}

package com.hanyi._08方法引用方式三_特定类型的方法引用;

import java.util.Arrays;

/**
 * 目标：方法引用方式三-特定方法的引用
 *
 * 特定方法的引用
 *  特定类型：String，任意类型
 *  格式：特定类型::方法。
 *  注意：
 *  如果第一个参数列表中的形参中的第一个参数作为后面的方法的调用者，
 *  并且其余参数作为后面方法的参数，那么就可以用特定类型方法应用了。
 */
public class MethodDemo01 {
    public static void main(String[] args) {
        String[] strings = new String[]{"j1", "A1", "aa", "s1", "HH", "g1", "bv"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strings));
    }
}

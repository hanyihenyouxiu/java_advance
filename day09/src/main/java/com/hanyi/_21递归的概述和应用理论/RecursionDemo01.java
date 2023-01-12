package com.hanyi._21递归的概述和应用理论;

/**
 * 目标：递归的形式
 *
 * 递归：方法在方法中调用自己。
 *
 * 递归：
 *      直接递归：自己调用自己的方法
 *      间接递归：自己调用其他方法，其他方法调用自己。
 * 小结：
 *      递归是自己调用自己。
 *      递归如果控制的不恰当，会形成递归的死循环，从而导致栈内存溢出错误！
 *      递归应该防止进入递归的死循环！
 */
public class RecursionDemo01 {
    public static void main(String[] args) {
        A();
    }

    public static void A() {
       // A();
    }
}

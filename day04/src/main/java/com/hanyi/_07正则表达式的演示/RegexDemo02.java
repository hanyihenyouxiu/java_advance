package com.hanyi._07正则表达式的演示;

/**
 * 目标：深入学习正则表达式的写法。
 *
 * 字符类：
 *  [abc] a、b 或 c
 *  [^abc] 任意字符 除了a、b 或 c(否定)
 *  [a-zA-Z] a 到 z A 到 Z，两头的字母包含在内(范围)
 *  [a-d[m-p]] a 到 d 或 m 到 p: [a-dm-p]并集
 *  [a-z&&[def23]] d、e 或 f (交集)
 *  [a-z&&[^bc]] a 到 z、除了 b 和 c: [ad-z]（减去）
 *  [a-z&&[^m-p] a 到 z、而非 m - p： [a-lp-z] (减去)
 *
 *  预定义字符串
 *      任意字符
 *      \d 数字：[0-9]
 *      \D 非数字: [^0-9]
 *      \s 空白字符：[\t\n\x0B\f\r]
 *      \S 非空白字符：[^\s]
 *      \w 单词字符：[a-zA-Z_0-9]
 *      \W 非单词字符：[^/w]
 *  以上正则表达式只能校验单个字符。
 *
 *  Greedy 数量词
 *      X? X, 一次或一次也没有
 *      X* X, 零次或多次
 *      X+ X, 一次或多次
 *      X{n} X, 恰好n次
 *      X{n,} X, 至少n次
 *      X{n,m} X, 至少n次，但是不超过m次
 *
 * java API pattern中有很多详解
 */
public class RegexDemo02 {
    public static void main(String[] args) {
        System.out.println("a".matches("[abc]"));
        System.out.println("z".matches("[abc]"));
        System.out.println("a".matches("[^abc]"));
        System.out.println("z".matches("[^abc]"));
    }
}
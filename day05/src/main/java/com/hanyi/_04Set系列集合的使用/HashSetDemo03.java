package com.hanyi._04Set系列集合的使用;

/**
 * 目标：Set系列集合元素无序的根本原因。
 *
 * Set系列集合添加元素无序的根本原因是因为底层采用了哈希表存储元素。
 *
 * JDK1.8之前；哈希表 = 数组 + 链表 + （哈希算法）
 * JDK1.8之后；哈希表 = 数组 + 链表 + 红黑树 + （哈希算法）
 *  当链表长度超过阈值（8）时，将链表转换为红黑树，这样大大减少了查找时间。
 */
public class HashSetDemo03 {
    public static void main(String[] args) {

    }
}

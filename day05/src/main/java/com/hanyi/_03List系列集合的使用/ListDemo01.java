package com.hanyi._03List系列集合的使用;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合继承了Collection集合的全部功能，同时因为List系列集合有索引，
 * ArrayList集合底层基于数组存储数据的，查询快，增删慢！
 * 因为List集合多了索引，所以多了很多按照索引操作元素的功能：
 *  - public void add(int index, E element)：将指定的元素，添加到该集合中的指定位置上。
 *  - public E get(int index)：返回集合中指定位置的元素。
 *  - public E remove(int index)：移除列表中指定位置的元素，返回的是被移除的元素。
 *  - public E set(int index, E element)：用指定元素替换集合中指定位置的元素，返回值的更新前的元素
 * 小结：
 *  List系列集合有序，可重复，有索引的。
 *  ArrayList实现类集合地层基于数组存储数据的，查询快，增删慢！
 *  开发中常用！
 */
public class ListDemo01 {
    public static void main(String[] args) {
        // 1.创建一个ArrayList集合对象；这是一行经典代码！
        List<String> lists = new ArrayList<>();
        lists.add("1");
        lists.add("1");
        lists.add("3");
        lists.add("4");
        // 2.在某个索引位置插入元素。
        lists.add(0, "0");
        // 3.根据索引删除元素，返回被删除元素。
        System.out.println(lists.remove("4"));
        // 4.根据索引获取元素
        System.out.println(lists.get(1));
        // 5.修改索引位置处的元素
        System.out.println(lists.set(2, "2"));
    }
}

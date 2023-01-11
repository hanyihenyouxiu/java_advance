package com.hanyi._03List系列集合的使用;

import java.util.LinkedList;

/**
 * LinkedList也是List的实现类：底层是基于链表的，增删比较快，查询慢！
 * LinkedList是支持双链表，定位前后的元素是非常快的，增删首尾的元素也是最快的。
 * 所以LinkedList除了拥有List集合的全部功能还多了很多操作首位元素的特殊功能：
 *  - public void addFirst(E e)：将指定元素插入此列表的开头
 *  - public void addLast(E e)：将指定元素插入到此列表的末尾。
 *  - public E getFirst()：返回此列表的第一个元素。
 *  - public E getLast()：返回此列表的最后一个元素。
 *  - public E removeFirst()：移除并返回此列表的第一个元素。
 *  - public E removeLast()：移除并返回此列表的最后一个元素。
 *  - public E pop()：从此列表所表示的堆栈处弹出一个元素。
 *  - public void push(E e)：将元素推入此列表所表示的堆栈。
 *
 * 小结：
 *      LinkedList是支持双链表，定位前后的元素是非常快的，增删首尾元素也是最快的。
 *      所以提供了很多操作首位元素的特殊API可以做栈和队列的实现。
 */
public class ListDemo03 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);
        list.add(0, "0");
        System.out.println(list);
        System.out.println(list.pop());
        list.push("0");
        System.out.println(list);

        list.addFirst("-1");
        list.addLast("20");
        System.out.println(list);
    }
}

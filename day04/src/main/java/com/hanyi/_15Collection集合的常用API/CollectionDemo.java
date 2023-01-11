package com.hanyi._15Collection集合的常用API;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * 目标：Collection集合的常用API
 *
 * Collection是集合的祖宗类，它的功能时全部都可以继承使用的，所以要学习它。
 * Collection API如下：
 *      - public boolean add(E e)： 把给定的对象添加到当前集合中。
 *      - public void clear()：清空集合中所有的元素。
 *      - public boolean remove(E e)：把给定的对象在当前集合中删除。
 *      - public boolean contains(Object obj)：判断当前集合中是否包含给定的对象。
 *      - public boolean isEmpty()：判断当前集合是否为空。
 *      - public int size()：返回集合中的元素的格式。
 *      - public Object[] toArray()：把集合中的元素，存储到数组中。
 * 小结：牢记API
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> list = new HashSet<>();
        // 添加元素
        System.out.println(list.add("贾乃亮"));
        System.out.println(list.add("王宝强"));
        System.out.println(list.add("陈羽凡"));

        // 清空集合
        list.clear();
        System.out.println(list);

        // 判断是否为空
        //System.out.println(list.isEmpty());

        // 获取集合的大小
        System.out.println(list.size());

        // 判断集合是否有某个元素
        System.out.println(list.contains("王宝强"));

        // 删除某个元素
        System.out.println(list.remove("贾乃亮"));

        // 将集合转成数组
        //String[] objects = list.toArray(String[]::new);
        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));
    }
}

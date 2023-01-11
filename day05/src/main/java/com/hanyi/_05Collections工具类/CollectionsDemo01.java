package com.hanyi._05Collections工具类;

import java.util.*;

/**
 * 目标：Collections工具类的使用。
 * <p>
 * java.utils.Collections：是集合工具类
 * Collections并不属于集合，是用来操作集合的工具类。
 * Collections有几个常用的API：
 * -- public static <T> boolean addAll(Collection<? super T> c, T..elements)
 * 给集合对象批量添加元素！
 * -- public static void shuffle(List<?> list)：打乱集合顺序。
 * -- public static <T> void sort(List<T> list)：将集合中元素按照默认顺序排序。
 * -- public static <T> void sort(List<T> list, Comparator<? super T>):将集合中的元素按照制定方式排序。
 */
public class CollectionsDemo01 {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        /*
         * 参数一：被添加元素的集合
         * 参数二：可变参数，一批元素
         */
        Collections.addAll(names, "曹操", "刘备", "关羽");
        System.out.println(names);
        List<String> eName = new ArrayList<>();
        Collections.addAll(eName, "a", "b", "c", "d");
        Collections.shuffle(eName);
        System.out.println(eName);

        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores, 3.2, 4.2, 1.2, 2.2);
        Collections.sort(scores);
        System.out.println(scores);
    }
}

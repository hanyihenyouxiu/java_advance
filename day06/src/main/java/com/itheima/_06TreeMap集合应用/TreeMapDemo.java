package com.itheima._06TreeMap集合应用;

import com.itheima._07Map集合联系.Tortoise;

import java.util.Map;
import java.util.TreeMap;

/**
 * 目标：TreeMap集合的应用
 *
 * TreeMap集合按照键是可排序不重复的键值对集合。
 * TreeMap集合按照键排序的特点与TreeSet是完全一样的。
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(10, "第1名");
        map.put(5, "第2名");
        map.put(7, "第3名");
        map.put(3, "第4名");
        map.put(8, "第5名");
        System.out.println(map);

        Map<Tortoise, String> map1 = new TreeMap<>();
        map1.put(new Tortoise("第一", 1), "第1名");
        map1.put(new Tortoise("第二", 2), "第2名");
        map1.put(new Tortoise("第三", 3), "第3名");
        map1.put(new Tortoise("第四", 4), "第4名");
        System.out.println(map1);
    }
}

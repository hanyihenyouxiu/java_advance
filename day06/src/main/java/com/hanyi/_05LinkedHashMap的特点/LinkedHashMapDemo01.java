package com.hanyi._05LinkedHashMap的特点;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 目标：LinkedHashMap的特点介绍。
 *
 * LinkedHashMap是HashMap的子类。
 *      -- 添加的元素按照键有序，不重复的。
 * HashSet集合相当于是HashMap集合的键都不带值。
 * LinkedHashSet相当于是LinkedHashMap集合的键都不带值。
 *
 * 底层原理完全一样，都是基于哈希表存储数据的，
 * 只是HashMap或者LinkedHashMap的键都多一个附属值。
 *
 * 小结：
 *      HashMap集合是无序不重复的键值对集合。
 *      LinkedHashMap集合是有序不重复的键值对集合。
 *      他们都是基于哈希表存储数据。
 */
public class LinkedHashMapDemo01 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        Map<String, String> map1 = new LinkedHashMap<>();
        map.put("1", "10");
        map.put("2", "20");
        map.put("3", "30");
        map.put("4", "40");
        map.put("5", "50");
        map.put("1", "60");

        map1.put("1", "10");
        map1.put("2", "20");
        map1.put("3", "30");
        map1.put("4", "40");
        map1.put("5", "50");
        map1.put("1", "60");
        System.out.println(map);
        System.out.println(map1);
    }
}

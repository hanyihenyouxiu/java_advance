package com.itheima._03Map集合的遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 目标：Map集合的遍历方式
 *
 * Map集合的遍历方式：三种
 * 1、键找值的方式遍历：先获取到Map集合全部的键，在循环键获取值。
 * 2、键值对的方式遍历：难度较大。
 * 3、JDK1.8之后的新技术：Lambda表达式。
 */
public class MapDemo01 {
    public static void main(String[] args) {
        // 先获取Map集合中的所有键然后遍历获取值
        Map<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(map.get(string));
        }

        // 获取到键值对，遍历
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }

        // 使用Lambda表达式遍历
        map.forEach((k,v) -> System.out.println(k + "-->" + v));
    }
}

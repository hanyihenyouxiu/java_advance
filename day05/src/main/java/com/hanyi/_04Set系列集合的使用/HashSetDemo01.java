package com.hanyi._04Set系列集合的使用;

import java.util.HashSet;
import java.util.Set;

/**
 * Set系列集合：添加元素，是有序的，不重复的，无索引的。
 *      -- HashSet：添加的元素,是无序，不重复，无索引的。
 *      -- LinkedHashSet：添加的元素，是有序，不重复，无索引的。
 *      -- TreeSet：不重复，无索引，按照大小默认升序排序。
 * 1）Set集合添加的元素是不重复的，是如何去重的？
 * 2）Set集合元素无序的原因是什么？
 */
public class HashSetDemo01 {
    public static void main(String[] args) {
        Set<String> sets = new HashSet<>();
        sets.add("Mybatis");
        sets.add("Java");
        sets.add("MySql");
        sets.add("Java");
        sets.add("Spring");
        System.out.println(sets);
    }
}

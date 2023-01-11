package com.hanyi._12Stream流的常用API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 目标:Stream流的常用API
 *
 * forEach:逐个处理
 * count:统计个数
 *      -- long count()
 * filter:过滤元素
 *      -- Stream<T> filter(Predicate<? super T> predicate)
 * limit :获取几个元素
 * skip：跳过前几个
 * map：加工方法
 * concat：合并流
 */
public class StreamDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张三");
        list.add("张无忌");
        list.add("张翠山");
        list.add("殷素素");
        list.add("周芷若");
        list.add("周周");
        list.add("周1周");

        System.out.println(list.stream().filter(s -> s.contains("张")).collect(Collectors.toList()));
        System.out.println(list.stream().filter(s -> s.contains("周")).filter(s -> s.length() >= 3).collect(Collectors.toList()));
    }
}

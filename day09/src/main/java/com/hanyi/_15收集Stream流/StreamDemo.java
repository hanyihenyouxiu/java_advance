package com.hanyi._15收集Stream流;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 目标：收集Stream流，把stream流的数据转回集合。
 *
 * 引入：
 *  Stream的作用是：把集合转换成一根传送带，借用stream流的强大功能进行的操作。
 *  但是实际开发中数据最终的形式还是集合，最终stream流操作完毕以后还是要转换成集合。
 *  这就是收集Stream流。
 *
 * Stream流：手段。
 * 集合：才是目的。
 *
 * 流：只能使用一次。
 */
public class StreamDemo {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("41");
        strings.add("11");
        Stream<String> stream = strings.stream().filter(s -> s.contains("1"));
        System.out.println(stream.collect(Collectors.toSet()));
        //System.out.println(stream.collect(Collectors.toList()));//上一步流已经结束。需要重新创建流
    }
}

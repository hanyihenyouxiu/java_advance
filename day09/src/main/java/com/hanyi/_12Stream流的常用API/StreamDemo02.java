package com.hanyi._12Stream流的常用API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * map:映射，把原来的元素操作之后，重新放回去
 */
public class StreamDemo02 {
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

        System.out.println(list.stream().map((b) -> "hanyi-" + b).collect(Collectors.toList()));

        System.out.println(list.stream().map(Student::new).collect(Collectors.toList()));
    }
}

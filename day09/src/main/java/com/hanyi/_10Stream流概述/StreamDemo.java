package com.hanyi._10Stream流概述;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 目标：演示Stream流的强大。
 *
 * 什么是Stream流？
 *  在Java 8中，得益于Lambda所带来的函数式编程。
 *  引入了一个全新的Stream流概念，用于解决已有集合/数组类库有的弊端。
 * Stream流能解决什么问题？
 *  可以解决已有集合类库或者数组API的弊端。
 *  Stream认为集合和数组操作的API很不好用，所以采用乐Stream流简化集合和数组的操作！
 * 小结：
 * Stream流是用来简化集合类库或者数组API的弊端。
 * Stream流其实就是一根传送带，元素在上面可以被stream流操作。
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("周芷若");
        list.add("小昭");
        list.add("珠儿");
        list.add("赵敏");
        list.add("张无忌");
        list.add("张三");
        list.add("张三丰");

        List<String> z = list.stream().filter(s -> s.contains("张")).collect(Collectors.toList());
        System.out.println(z);

    }
}

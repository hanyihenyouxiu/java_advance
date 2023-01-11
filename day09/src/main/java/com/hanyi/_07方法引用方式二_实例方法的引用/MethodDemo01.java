package com.hanyi._07方法引用方式二_实例方法的引用;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标：方法引用-->实例方法的引用
 *
 * 实例方法的引用：
 *  格式：对象::实例方法
 *  简化步骤：
 *      a.定义一个实例方法，把需要的代码方到实例方法中去。
 *  实例方法引用的注意事项
 *      "重要：被引用的方法的参数列表和函数式接口中的抽象方法的参数列表一致"
 */
public class MethodDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java1");
        list.add("Java2");
        list.add("Java3");
        list.add("Java4");
        list.forEach(s -> System.out.println(s));
        // 方法引用
        list.forEach(System.out::println);
    }
}

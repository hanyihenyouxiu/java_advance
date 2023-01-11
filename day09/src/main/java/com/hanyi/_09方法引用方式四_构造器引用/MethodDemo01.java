package com.hanyi._09方法引用方式四_构造器引用;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标：方法引用方式四_构造器引用
 *
 * 构造器引用：
 *  格式是：类名::new
 *  注意点：前后参数一致的情况下，又在创建对象就可以使用构造器引用
 *  s -> new Student(s) ==> Student::new
 *
 *  小结：
 *      方法引用是可遇不可求，能用则用，不能就不要用！
 */
public class MethodDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");

        Object[] objects = list.toArray();

        //String[] strs = list.toArray(String[]::new);
    }
}

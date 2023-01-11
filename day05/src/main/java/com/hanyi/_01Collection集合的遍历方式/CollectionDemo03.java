package com.hanyi._01Collection集合的遍历方式;

import java.util.ArrayList;
import java.util.Collection;

/**
 * c.JDK1.8开始之后的新技术Lambda表达式。
 */
public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("赵敏");
        lists.add("小昭");
        lists.add("殷素素");
        lists.add("周芷若");
        lists.forEach(System.out::println);
    }
}

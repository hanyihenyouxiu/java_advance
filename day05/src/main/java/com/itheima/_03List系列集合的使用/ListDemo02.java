package com.itheima._03List系列集合的使用;

import java.util.ArrayList;
import java.util.List;

/**
 * 因为list集合有索引，所以比Collection多一种遍历方式就是for循环
 */
public class ListDemo02 {
    public static void main(String[] args) {
        List<String> lsit = new ArrayList<>();
        lsit.add("1");
        lsit.add("2");
        lsit.add("3");
        for (int i = 0; i < lsit.size(); i++) {
            System.out.println(lsit.get(i));
        }
    }
}

package com.hanyi._04Map集合存储自定义类型;

import java.util.HashMap;
import java.util.Map;

/**
 * 目标：Map集合存储的自定义类型；
 *
 * Map集合的键和值都可以存储自定义类型。
 *
 * 小结：如果希望Map集合认为键的内容一样就重复了，可以重写hashCode()和equals()方法！
 */
public class MapDemo01 {
    public static void main(String[] args) {
        Turtle turtle = new Turtle("王文博", 37);
        Turtle turtle1 = new Turtle("王文博", 37);
        Turtle turtle2 = new Turtle("夯货", 37);
        Map<Turtle, String> map = new HashMap<>();
        map.put(turtle, "王文博是乌龟");
        map.put(turtle1, "爱骗人的老蠢龟");
        map.put(turtle2, "小夯货");
        map.forEach((k, v) -> System.out.println(k + "" + v));
    }
}

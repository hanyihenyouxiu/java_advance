package com.hanyi._11Stream流的获取;

import java.util.HashMap;
import java.util.Map;

/**
 * 目标：Stream流的获取
 *
 * Stream流式思想的核心：
 *      是先得到集合或者数组的Stream流
 *      然后就用这个Stream流操作集合或者数组的元素。
 *      然后用Stream流简化替代集合操作的API。
 * 集合获取流的API：
 *      1.default Stream<E> stream();
 * 小结：
 *      集合获取Stream流用stream()
 *      数组：Arrays.stream(数组)/Stream.of(数组)
 */
public class StreamDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //map.keySet().forEach();
        //map.values().forEach();
        //map.entrySet().forEach();
    }
}

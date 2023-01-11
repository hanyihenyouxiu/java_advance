package com.hanyi._12Stream流的常用API;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 数组
 */
public class StreamDemo03 {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(10, 20, 30, 40);
        Stream<Integer> integerStream1 = Stream.of(50, 60, 70, 80);
        System.out.println(Arrays.toString(Stream.concat(integerStream, integerStream1).toArray()));
    }
}

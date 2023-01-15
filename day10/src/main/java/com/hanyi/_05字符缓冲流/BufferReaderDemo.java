package com.hanyi._05字符缓冲流;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * 目标： 字符缓冲输入流
 *
 * 字符缓冲输入流:BufferedReader
 *      -- 作用：字符缓冲输入流可以把字符输入流包装成一个高级的缓冲字符输入流，
 *             可以提高字符输入读取数据的性能。
 *      -- 构造器：public BufferedReader(Reader reader)
 *      -- 原理：缓冲字符输入流默认会有一个8k的字符缓冲池，可以提高读字符的性能。
 *      -- 缓冲字节输入流除了提高了字符输入流的读数据性能，还多了一个按照行读取数据的功能
 *          public String readLine()：读取一行数据返回，读取完毕返回null
 */
public class BufferReaderDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("day10\\src\\main\\java\\com\\hanyi\\_01字符流的使用\\a.txt");
        FileReader r = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(r);
        String res = "";
        while ((res = bufferedReader.readLine()) != null) {
            System.out.println(res);
        }
    }
}

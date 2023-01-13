package com.hanyi._25字节流的使用;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * 解决中文乱码
 *
 * 定义一个字节数组与文件的大小刚刚一样大，然后一桶水都区全部字节数组在输出！
 * 可以避免中文读取输出乱码，但是如果读取的文件太大，就不行了，最大支持int类型最大值。
 */
public class FileInputStreamDemo03 {
    public static void main(String[] args) throws Exception {
        File fi = new File("day09/src/main/java/com/hanyi/_25字节流的使用/a.txt");
        InputStream in = Files.newInputStream(fi.toPath());
//        byte[] buffer = new byte[(int) fi.length()];
//        int read = in.read(buffer);
//        System.out.println(Arrays.toString(buffer));
//        System.out.println(new String(buffer, 0, read));
        //in.readAllBytes(); jdk9之后

    }
}

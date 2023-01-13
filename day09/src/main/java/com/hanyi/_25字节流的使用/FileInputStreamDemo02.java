package com.hanyi._25字节流的使用;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Arrays;

/**
 * 使用字节数组读取内容，效率可以。
 * 但是使用字节数组读取文本内容，无法避免中文乱码。
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws Exception{
        File fi = new File("day09/src/main/java/com/hanyi/_25字节流的使用/a.txt");
        InputStream in = Files.newInputStream(fi.toPath());
        byte[] bytes = new byte[4];
        int length;
        while ((length = in.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, length));
        }
    }
}

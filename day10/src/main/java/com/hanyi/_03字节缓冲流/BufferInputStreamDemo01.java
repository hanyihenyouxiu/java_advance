package com.hanyi._03字节缓冲流;

import java.io.*;
import java.nio.file.Files;

/**
 * 目标：字节输入缓冲流的使用
 * <p>
 * 字节缓冲输入流：BufferedInputStream
 * -- 作用：可以把低级的字节输入流包装成一个高级的缓冲字节输入流通道，
 * 从而提高字节输入流读取数据的性能。
 * -- 构造器：public BufferedInputStream(InputStream in)
 */
public class BufferInputStreamDemo01 {
    public static void main(String[] args) throws Exception{
        File fi = new File("day10\\src\\main\\java\\com\\hanyi\\_01字符流的使用\\a.txt");
        InputStream r = Files.newInputStream(fi.toPath());
        BufferedInputStream bu = new BufferedInputStream(r);
        int res;
        while ((res= bu.read()) != -1) {
            System.out.println((char)res);
        }
        bu.close();
        r.close();
    }
}

package com.hanyi._03字节缓冲流;

import java.io.*;
import java.nio.file.Files;

/**
 * 目标：字节输出缓冲流的使用
 */
public class BufferInputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        File fi = new File("day10\\src\\main\\java\\com\\hanyi\\_01字符流的使用\\C.txt");
        OutputStream r = Files.newOutputStream(fi.toPath());
        BufferedOutputStream bu = new BufferedOutputStream(r);
        bu.write('1');
        bu.write("寒".getBytes());
        bu.write("毅".getBytes());
        bu.close();
        r.close();
    }
}

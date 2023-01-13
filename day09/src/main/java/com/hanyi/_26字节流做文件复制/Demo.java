package com.hanyi._26字节流做文件复制;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;

/**
 * 文件复制
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        File fi = new File("day09/src/main/java/com/hanyi/_25字节流的使用/a.txt");
        File fo = new File("day09/src/main/java/com/hanyi/_25字节流的使用/b.txt");
        InputStream in = Files.newInputStream(fi.toPath());
        OutputStream ou = Files.newOutputStream(fo.toPath());
        int length;
        byte[] bytes = new byte[4];
        while ((length = in.read(bytes)) != -1) {
            //System.out.println(new String(bytes, 0, length));
            ou.write(bytes, 0 , length);
        }
    }
}

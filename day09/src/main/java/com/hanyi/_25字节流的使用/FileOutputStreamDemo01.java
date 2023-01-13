package com.hanyi._25字节流的使用;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.Arrays;

/**
 *
 */
public class FileOutputStreamDemo01 {

    public static void main(String[] args) throws Exception{
        File fo = new File("day09/src/main/java/com/hanyi/_25字节流的使用/b.txt");
        OutputStream ou = Files.newOutputStream(fo.toPath());
        ou.write('c');
        ou.write('v');
        ou.flush();
        ou.close();
    }
}

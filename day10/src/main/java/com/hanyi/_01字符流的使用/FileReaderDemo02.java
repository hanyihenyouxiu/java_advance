package com.hanyi._01字符流的使用;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

/**
 *
 */
public class FileReaderDemo02 {
    public static void main(String[] args) throws Exception {
        File fi = new File("day10\\src\\main\\java\\com\\hanyi\\_01字符流的使用\\a.txt");
        Reader r = new FileReader(fi);
        char[] buffer = new char[3];
        int res;
        while ((res= r.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, res));
        }
        r.close();
    }
}

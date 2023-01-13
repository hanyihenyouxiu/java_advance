package com.hanyi._25字节流的使用;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;

/**
 * Created with IntelliJ IDEA.
 * User: 寒毅
 * Date: 2023/1/13
 * Time: 15:43
 * Description:
 *
 * @author 寒毅
 */
public class FileOutputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        File fi = new File("day09/src/main/java/com/hanyi/_25字节流的使用/a.txt");
        File fo = new File("day09/src/main/java/com/hanyi/_25字节流的使用/b.txt");
        InputStream in = Files.newInputStream(fi.toPath());
        OutputStream ou = Files.newOutputStream(fo.toPath());
        int length;
        byte[] bytes = new byte[4];
        while ((length = in.read(bytes)) != -1) {
            //System.out.println(new String(bytes, 0, length));
            ou.write(bytes);
        }
    }
}

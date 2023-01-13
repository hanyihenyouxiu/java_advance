package com.hanyi._25字节流的使用;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;

/**
 * 目标：字节输入流的使用。
 * <p>
 * IO流的体系：
 * 字节流                                     字符流
 * 字节输入流            字节输出流               字符输入流       字符输出流
 * InputStream          OutputStream           Reader           Writer          （抽象类）
 * FileInputStream      FileOutputStream       FileReader       FileWriter      （实现类）
 * <p>
 * 1.FileInputStream文件字节输入流。
 * -- 作用：以内存为基准，把磁盘文件中的数据按照字节的形式读入到内存中的流。
 * <p>
 * -- 构造器：
 * 1.public FileInputStream(File path):创建一个字节输入流管道与源文件对象接通。
 * 2.public FileInputStream(String pathName)：创建一个自己输入流管道与文件路径对接。
 * <p>
 * -- 方法：
 * 1.public int read()：每次读取一个字节返回，读取完完毕会返回-1。
 *
 * 小结：
 *      一个一个字节读取英文和数字没有问题。
 *      但是一旦读取到中文输出无法避免乱码。
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws Exception{
        File fi = new File("day09/src/main/java/com/hanyi/_25字节流的使用/a.txt");
        //File fo = new File("day09/src/main/java/com/hanyi/_25字节流的使用/b.txt");
        InputStream in = Files.newInputStream(fi.toPath());
        //OutputStream ou = Files.newOutputStream(fo.toPath());
        while (true) {
            int i = in.read();
            if (i==-1) return;
            System.out.println(i);
            System.out.println((char) i);
            //ou.write(i);
        }
    }
}

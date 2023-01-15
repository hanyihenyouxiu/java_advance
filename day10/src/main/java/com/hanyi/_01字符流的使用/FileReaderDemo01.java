package com.hanyi._01字符流的使用;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

/**
 * 目标：字符输入流的使用。
 *
 * IO流的体系：
 *                  字节流                                             字符流
 *      字节输入流               字节输出流                    字符输入流           字符输出流
 *      InputStream             OutputStream               Reader              Writer               抽象类
 *      FileInputStream         FileOutputStream           FileReader          FileWriter           实现类
 *
 *      FileReader：文件字符输入流
 *      --作用：以内存为基准，把磁盘文件的数据以字符的形式读入到内存。
 *          简单来说，读取文本文件内容到内存中去。
 *      --构造器：
 *          public FileReader(File file)：创建一个字符输入流与源文件对象接通。
 *          public FileReader(String filePath)：创建一个字符输入流与源文件路径接通。
 *      --方法：
 *          public int raed()：读取一个字符的编号返回！读取完毕返回-1.
 *          public int read(char[] buffer)：读取一个字符数组，读取多少个字符就返回多少个数据。
 *      小结：
 *          字符流一个一个字符的读取文本内容输出，可以解决中文读取输出乱码的问题。
 *          字符流很适合操作文本文件。
 */
public class FileReaderDemo01 {
    public static void main(String[] args) throws Exception {
        File fi = new File("day10\\src\\main\\java\\com\\hanyi\\_01字符流的使用\\a.txt");
        Reader r = new FileReader(fi);
        int res;
        while ((res= r.read()) != -1) {
            System.out.println((char)res);
        }
        r.close();
    }
}

package com.hanyi._01字符流的使用;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/**
 * 目标：字符输出流的使用
 *
 * FileWriter文件字符输出流的使用
 *  -- 作用：一内存为基准，把内存中的数据按照字符的形式写出到磁盘文件中去。
 *      简单来说，就是把内存的数据以字符写出到文件中去。
 *  -- 构造器：
 *      public FileWriter(File file)：创建一个字符输出流管道通向目标文件对象。
 *      public FileWriter(String filePath)：创建一个字符输出流通向目标文件路径。
 *      public FileWriter(File file, boolean append)：创建一个追加数据的字符输出流管道通向目标文件。
 *      public FileWriter(String filePath, boolean append)：创建一个追加数据的字符输出流管道通向目标路径。
 *
 *  -- 方法：
 *      public void write(int c)：写一个字符出去
 *      public void write(String c)：写一个字符串出去
 *      public void write(char[] buffer)：写一个字符数组出去
 *      public void write(String c, int pos, int len)：写写字符串的一部分出去。
 *  小结：
 *      字符输出流，可以将字符写入到目标文件。
 *      覆盖方法.write
 *      追加方法.append
 */
public class FileWriterDemo01 {
    public static void main(String[] args) throws Exception{
        File fi = new File("day10\\src\\main\\java\\com\\hanyi\\_01字符流的使用\\b.txt");
        Writer w = new FileWriter(fi);
        w.write("寒毅很优秀。。。");
        w.write("勿");
        w.append("念，吹牛皮！！！");
        w.close();
    }
}

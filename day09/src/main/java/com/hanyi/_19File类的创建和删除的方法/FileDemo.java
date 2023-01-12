package com.hanyi._19File类的创建和删除的方法;

import java.io.File;
import java.io.IOException;

/**
 * 目标：File类的创建和删除
 *  - public  boolean createNewFile()：当且仅当具有该名称的文件尚未存在时，创建一个新的空文件。
 *  - public  boolean delete()：删除由此File表示的文件或目录。
 *  - public  boolean mkdir()：创建由此File表示的目录。
 *  - public  boolean mkdirs()：可以创建多级目录。
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        //File f = new File("D:\\hy\\notices\\ideaWorkSpace\\java_advance\\day09\\src\\main\\java\\com\\hanyi\\_16File类的概述\\test.text");
        //System.out.println(f.createNewFile());

        //System.out.println(f.delete());
        File f1 = new File("D:\\hy\\notices\\ideaWorkSpace\\java_advance\\day09\\src\\main\\java\\com\\hanyi\\_19File类的创建和删除的方法\\ttt");
        System.out.println(f1.mkdir());
        //System.out.println(f.mkdir());
    }
}

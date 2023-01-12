package com.hanyi._17File类的获取功能的方法;

import java.io.File;

/**
 * 目标：File类的获取功能的API
 * - public String getAbsolutePath()：返回此File的绝对路径名称字符串。
 * - public String getPath()：获取创建文件对象的时候用的路径。
 * - public String getName()：返回由此File表示的文件或目录的名称。
 * - public long length()：返回由此File表示的文件的长度。
 */
public class FileDemo {
    public static void main(String[] args) {
        File f = new File("D:\\hy\\notices\\ideaWorkSpace\\java_advance\\day09\\src\\main\\java\\com\\hanyi\\_16File类的概述\\1.jpg");
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getName());
        System.out.println(f.getPath());
        System.out.println(f.length());
    }
}

package com.hanyi._18File类的判断功能的方法;

import java.io.File;

/**
 * 目标：File类的判断功能的方法。
 * - public boolean exists()：此File表示的文件或目录是否实际存在。
 * - public boolean isDirectory()：此File表示的是否为目录。
 * - public boolean isFile()：此File表示的是否为目录。
 */
public class FileDemo {
    public static void main(String[] args) {
        File f = new File("D:\\hy\\notices\\ideaWorkSpace\\java_advance\\day09\\src\\main\\java\\com\\hanyi\\_16File类的概述\\1.jpg");
        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
    }
}

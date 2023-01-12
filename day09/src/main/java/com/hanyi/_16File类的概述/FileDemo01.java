package com.hanyi._16File类的概述;

import java.io.File;

/**
 * 目标：File类的概述和API
 *
 * File类：代表当前操作系统的文件对象。
 * File类：是用来操作系统文件对象的，删除文件，获取文件信息，创建文件
 *      广义来说操作系统认为文件包含（文件和文件夹）
 *
 * File类的创建文件对象的API：
 *      包：java.io.File
 *      1.构造器：child代表文件名
 *          -- public File(String pathName)：根据路径获取文件对象
 *          -- public File(String parent, String child)：根据父路径和文件名称获取文件对象
 *          -- public File(File parent, String child)
 *
 * File类创建文件对象的格式：
 *      a.
 *      File f= new File("绝对路径/相对路径")
 *          绝对路径：从磁盘的盘符一路走到目的位置的路径。
 *              -- 绝对路径依赖具体的环境，一旦脱离环境，代码可能报错！
 *          相对路径：不带盘符
 *              -- 默认是直接相对到工程目录下寻找文件的。
 *              -- 相对路径只能用于寻找工程的文件。
 *              -- 能用相对路径就应该尽量使用，可以跨平台。
 *      b.
 *      File f = new File("文件对象/文件夹对象")
 *          广义来说：文件就是文件和文件夹。
 * 小结：
 *  创建文件对象可以用绝对路径也可以使用相对路径
 *  相对路径用于工程下
 *  File代表文件和文件夹。
 */
public class FileDemo01 {
    public static void main(String[] args) {
        // 文件路径分隔符
        // 1.正斜杠：/
        // 2.反斜杠：\\
        // 3.分隔符API：File.separator
        File f = new File("D:\\hy\\notices\\ideaWorkSpace\\java_advance\\day09\\src\\main\\java\\com\\hanyi\\_16File类的概述\\1.jpg");
        System.out.println(f.getName());
        System.out.println(f.length());

        File fr = new File("day09/src/main/java/com/hanyi/_16File类的概述/1.jpg");
        System.out.println(fr.getName());
        System.out.println(fr.length());
        System.out.println(fr.getAbsolutePath());
        System.out.println(fr.getPath());

        File fd = new File("day09/src/main/java/com");
        System.out.println(fd.length());
        System.out.println(fd.exists());
    }
}

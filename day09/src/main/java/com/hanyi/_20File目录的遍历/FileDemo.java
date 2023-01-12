package com.hanyi._20File目录的遍历;

import java.io.File;
import java.util.Arrays;

/**
 * 目标：File针对目录的遍历
 *
 * - public String[] list()：
 *      获取当前目录下所有的"以及文件名称"到一个字符串数组中去返回。
 * - public File[] listFiles()：
 *      获取当前目录下所有的"以及文件对象"的一个文件对象数组中去返回。
 */
public class FileDemo {
    public static void main(String[] args) {
        File f = new File("D:\\hy\\notices\\ideaWorkSpace\\java_advance\\day09\\src\\main\\java\\com\\hanyi");
        Arrays.stream(f.list()).forEach(System.out::println);
        Arrays.stream(f.listFiles()).forEach(System.out::println);

        // 文件的最后修改时间
        //System.out.println(f.lastModified());
    }
}

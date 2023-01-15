package com.hanyi._08序列化;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 目标：对象反序列化
 *
 * 对象反序列化：ObjectInputStream
 *      -- 作用：读取序列化的对象文件恢复到Java对象中。
 *      -- 构造器：public ObjectInputStream（InputStream is）
 *      -- 方法：public final object readObject()
 *
 * 如果一个字段不参与序列化。transient它修饰的成员变量不参与序列化。
 */
public class SerializeDemo02 {
    public static void main(String[] args) throws Exception {
        InputStream is = Files.newInputStream(Paths.get("day10/src/main/java/com/hanyi/_08序列化/obj.dat"));
        ObjectInputStream ois = new ObjectInputStream(is);
        User u = (User) ois.readObject();
        System.out.println(u);
    }
}

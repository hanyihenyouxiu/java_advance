package com.hanyi._08序列化;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 目标：对象序列化
 * <p>
 * 对象序列化：就是把Java对象数据直接存储到文件中去。
 * 对象反序列化：就是把Java对象的文件数据恢复到Java对象中。
 * <p>
 * 对象序列化流：ObjectOutputStream
 * -- 作用：把内存中的Java对象数据保存到文件中去。
 * -- 构造器：public ObjectOutputStream(outputStream out)
 * -- 序列化方法：public final void writeObject(Object obj)
 */
public class SerializeDemo01 {
    public static void main(String[] args) throws Exception {
        User u = new User("loginName", "password");
        OutputStream outputStream = Files.newOutputStream(Paths.get("day10/src/main/java/com/hanyi/_08序列化/obj.dat"));
        ObjectOutputStream obj = new ObjectOutputStream(outputStream);
        obj.writeObject(u);
    }
}

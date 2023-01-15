package com.hanyi._09打印流;

import java.io.PrintStream;

/**
 * 目标：打印流PrintStream/PrintWriter
 * 打印流的作用：
 *      1.可以方便，快速的写数据出去。
 *      2.可以实现打印啥出去，就是啥。
 * 打印流的构造器：
 *      public PrintStream(OutputStream os)
 *      public PrintStream(String filepath)
 * 小结：
 *      打印流可以方便，且搞笑的打印各种数据。
 *      PrintStream不管可以打印数据，还可以写字符节数据出去。
 *      PrintWriter不光可以打印数据，还可以写字符数据出去。
 */
public class PrintStreamDemo01 {
    public static void main(String[] args) throws Exception {
        //OutputStream os = Files.newOutputStream(Paths.get("day10/src/main/java/com/hanyi/_09打印流/test.txt"));
        //PrintStream ps = new PrintStream(os);
        PrintStream ps = new PrintStream("day10/src/main/java/com/hanyi/_09打印流/test.txt");
        ps.println("123");
        ps.println("寒毅很优秀！");
    }
}

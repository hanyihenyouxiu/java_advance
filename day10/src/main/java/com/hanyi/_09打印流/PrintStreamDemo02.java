package com.hanyi._09打印流;

import java.io.PrintStream;

/**
 * 目标：打印流改变输出的流向。重定向
 */
public class PrintStreamDemo02 {
    public static void main(String[] args) throws Exception {
        PrintStream ps = new PrintStream("day10/src/main/java/com/hanyi/_09打印流/a.txt");
        System.setOut(ps);
        System.out.println("=寒毅很优秀！==");
        System.out.println("=寒毅很优秀！==");
        System.out.println("=寒毅很优秀！==");
        System.out.println("=寒毅很优秀！==");
        System.out.println("=寒毅很优秀！==");
    }
}

package com.itheima._14Date日期类;

import java.util.Date;

/**
 * 拓展：时间毫秒值的作用。
 *
 * 时间毫秒值可以用做时间的计算；例如代码的执行性能分析。
 */
public class DateDemo02 {
    public static void main(String[] args) {
        long startTime = new Date().getTime();
        for (int i = 0; i < 1000000; i++) {
            System.out.println("输出" + i);
        }
        long endTime = new Date().getTime();
        System.out.println((endTime - startTime) / 1000.0 + "s");
    }
}

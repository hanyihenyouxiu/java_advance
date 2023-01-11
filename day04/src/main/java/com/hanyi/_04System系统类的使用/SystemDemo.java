package com.hanyi._04System系统类的使用;

import java.text.SimpleDateFormat;

/**
 * 目标：System系统类的使用
 * System代表当前系统
 * 静态方法：
 *  1.public static void exit(int status):终止JVM虚拟机，非0是异常终止。
 *  2.public static long currentTimeMillis():获取当前系统此刻时间毫秒值。
 *  3.可以做数组的拷贝。
 *  arraycopy(object var0, int var1, Object var2, int var3, int var4);
 *  参数一：原数组。
 *  参数二：从原数组的那个位置开始赋值。
 *  参数三：目标数组。
 *  参数四：赋值到目标数组的那个位置。
 *  参数五：赋值几个。
 */
public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("程序开始");
        //System.exit(0);
        long l = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH--mm-ss");
        String format = sdf.format(l);
        System.out.println(format);
        System.out.println("程序结束");
    }
}

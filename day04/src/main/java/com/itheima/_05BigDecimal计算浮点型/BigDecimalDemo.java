package com.itheima._05BigDecimal计算浮点型;

import java.math.BigDecimal;

/**
 * 目标：BigDecimal大数据类。
 *
 * 引入：
 *  浮点型运算的时候直接 + - * / 可能会出现数据失真(精度问题)。
 *  BigDecimal可以解决浮点型运算数据丢失问题。
 *
 * BigDecimal类：
 *  包：java.math.BigDecimal
 *  创建对象的方式
 *      public static BigDecimal valueOf(double val):包装浮点数成为大数据对象。
 *  方法：
 *      public BigDecimal add(BigDecimal value);            加法运算
 *      public BigDecimal subtract(BigDecimal value);       减法运算
 *      public BigDecimal multiply(BigDecimal value);       乘法运算
 *      public BigDecimal divide(BigDecimal value);         除法运算
 *      public double doubleValue():                        转换成double类型
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
     // 浮点型运算的时候直接 + - * / 失真问题
        System.out.println(0.1 + 0.2);
        System.out.println(0.09 + 0.01);
        System.out.println(1.0 - 0.32);
        System.out.println(1.015 * 100);
        System.out.println(1.301 / 100);

        double a = 0.1;
        double b = 0.2;
        BigDecimal bigDecimal = BigDecimal.valueOf(a);
        bigDecimal = bigDecimal.add(BigDecimal.valueOf(b));
        System.out.println(bigDecimal);

        // 结果还是要用基本数据类型
        // BigDecimal只是用来解决精度问题的手段。
        b = bigDecimal.doubleValue();
        System.out.println(b);
    }
}

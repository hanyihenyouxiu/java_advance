package com.hanyi._06包装类的使用;

/**
 * 目标：包装类的特殊功能
 *
 * Java为了包装类做了一些特殊功能，以便程序员使用。
 * 包装类作为类首先拥有了Object类的方法。
 * 包装类作为引用类型的变量可以存储null值。
 *
 * 具体来看特殊功能主要有：
 *      1.可以把基本数据类型的值转换成字符串类型的值。
 *          --调用toString()方法。
 *          --调用Integer.toString(基本数据类型的值)得到字符串。
 *          --直接把基本数据类型+空字符串得到了字符串。
 *      2.把字符串类型的数值转换成对应的基本数据类型的值。
 *          --Xxx.parse("字符串类型的值")。
 *          --Xxx.valueOf("字符串类型的值")
 * 小结：
 *  包装类可以把字符串类型的数值转换成对应的基本数据类型的值
 */
public class PackageClass02 {
    public static void main(String[] args) {
        //a.把基本数据类型的值转换成字符串
        Integer i = 100;
        String it = i.toString();
        System.out.println(it + i);

        // b
        String its = Integer.toString(i);
        System.out.println(its);

        // c
        String its1 = 1 + "123";
        System.out.println(its1);

        // 将字符串转成基本数据类型
        String nums = "123";
        int x = Integer.parseInt(nums);
        System.out.println(x + 123);
        String doubleStr = "123.3";
        double x1 = Double.parseDouble(doubleStr);
        double x2 = Double.valueOf(doubleStr);
        System.out.println(x1 + 1213);
        System.out.println(x2 + 1213);
    }
}

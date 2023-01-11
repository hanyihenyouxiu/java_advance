package com.hanyi._06包装类的使用;

/**
 * 目标：包装类。
 *
 * 引入：
 *      Java认为一切皆对象。引用数据类型都是对象了。
 *      但是在Java中8大基本数据类型不是对象，只是表示一种数据的类型格式。
 *      Java为了一切皆对象的思想统一，把8大基本数据类型转换成对象的类，
 *      这个类称为基本数据类型的包装类。
 *
 *      基本数据类型              包装类（引用数据类型）
 *      byte                    Byte
 *      short                   Short
 *      int                     Integer(特殊)
 *      long                    Long
 *
 *      float                   Float
 *      double                  Double
 *      char                    Character(特殊)
 *      boolean                 Boolean
 *
 *      自动装箱：可以直接把基本数据类型的值或者变量赋值给包装类。
 *      自动拆箱：可以把包装类的变量直接赋值给基本数据类型。
 *
 *      小结：
 *      自动拆装箱。
 */
public class PackageClass01 {
    public static void main(String[] args) {
        int a = 12;
        Integer a1 = 12;

        double b = 99.9;
        Double b1 = 99.9;
        b = a;
    }
}

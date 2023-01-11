package com.hanyi._11自定义泛型方法;

/**
 * 目标：自定义泛型方法
 *
 * 什么是泛型方法？
 *      定义类泛型的方法就是泛型方法。
 * 泛型方法的定义格式：
 *      修饰符 <泛型变量> 返回值类型 方法名称(形参列表){
 *
 *      }
 *      注意：方法定义了是什么泛型变量，后面就只能用什么泛型变量。
 *      泛型类的核心思想：是把出现泛型变量的地方全部替换成传输的真是数据类型。
 *
 * 需求：给你任意一个类型的数组，都能返回它的内容。
 */
public class GenericityDemo {
    public static void main(String[] args) {
        Integer[] nums = {10, 20, 30, 40};
        String[] names = {"寒毅", "黑白", "夯货", "星星"};
        System.out.println(arrToString(nums));
        System.out.println(arrToString(names));
    }

    public static <T> String arrToString(T[] e) {
        StringBuilder str = new StringBuilder();
        str.append("[");
        if (e != null && e.length > 0) {
            for (int i = 0; i < e.length; i++) {
                str.append(i == e.length-1 ? e[i] : e[i] + ",");
            }
        }
        str.append("]");
        return str.toString();
    }
}

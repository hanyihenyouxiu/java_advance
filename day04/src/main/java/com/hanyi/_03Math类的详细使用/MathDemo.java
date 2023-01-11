package com.hanyi._03Math类的详细使用;

/**
 * 目标：Math类的使用
 *
 * Math用于做数学运算。
 * Math类中的方法全部是静态方法，直接用类名调用即可。
 *
 * 方法：
 *  方法名                                         说明
 *  public static int abs(int a)                  获取参数a的绝对值
 *  public static double ceil(double a)           向上取整
 *  public static double floor(double a)          向下取整
 *  public static double pow(double a, double b)  获取a的b次幂
 *  public static long round(double a)            四舍五入取整
 */
public class MathDemo {
    public static void main(String[] args) {
        // 绝对值
        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-20));
        // 向上取整
        System.out.println(Math.ceil(1.2));
        // 向下取整
        System.out.println(Math.floor(2.3));
        // 指数幂
        System.out.println(Math.pow(2, 3));
        // 四舍五入
        System.out.println(Math.round(1.4));
        System.out.println(Math.round(1.5));
    }
}

package com.hanyi._06可变参数;

/**
 * 目标：可变参数
 *
 * 可变参数用在形参中可以接受多个数据。
 * 可变参数的格式：数据类型... 参数名称
 *
 * 可变参数的作用：
 *  传输参数非常灵活，方便，
 *  可以不传参数
 *  可以传一个参数
 *  可以传多个参数
 *  可以传一个数组
 *
 * 可变参数在方法内部本质上就是一个数组。
 * 可变参数的注意事项：
 *  1.一个形参列表中可变参数只能有一个。
 *  2.可变参数必须放在形参列表的最后面。
 *
 */
public class MethodDemo {
    public static void main(String[] args) {
        sum();
        sum(1);
        sum(1, 2);
        int[] arr = new int[]{1,2};
        sum(1,2);
    }

    public static void sum(int... nums) {
        System.out.println(nums.length);
        System.out.println(nums);
    }
}

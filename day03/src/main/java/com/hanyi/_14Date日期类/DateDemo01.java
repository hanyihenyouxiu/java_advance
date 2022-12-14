package com.hanyi._14Date日期类;

import java.util.Date;

/**
 * 目标：Date日期类的使用。
 *
 * Java是面向对象的，会用一个类代表一个事物。
 * Date类在Java中代表的是系统当前此刻日期时间对象。
 *
 * Date类：
 *      包：java.util.Date
 *      构造器：
 *          -- public Date():创建当前系统的此刻日期时间对象。
 *          -- public Date(long time):
 *      方法：
 *          -- public long getTime(): 返回自1970年1月1日 00:00:00 GMT以来走过的总的毫秒值
 *
 *      时间记录的两种方式：
 *          a.Date日期对象。
 *          b.时间毫秒值：从1970-01-01 00:00:00开始从到此刻的总的毫秒值. 1s = 1000ms
 *      小结：
 *          Date可以代表系统当前此刻日期时间对象。
 *          时间记录的两种方式:
 *          Date日期对象
 *          时间毫秒值: 从1970-01-01 00:00:00 开始走到此刻的总的毫秒值。 1s = 1000ms
 */
public class DateDemo01 {
    public static void main(String[] args) {
        // 当前日期
        Date date = new Date();
        System.out.println(date);

        // 时间毫秒值
        long time = date.getTime();
        System.out.println(time);
    }
}

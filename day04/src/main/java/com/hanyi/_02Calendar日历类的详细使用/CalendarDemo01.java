package com.hanyi._02Calendar日历类的详细使用;

import java.util.Calendar;
import java.util.Date;

/**
 * 目标：日历类Calendar的使用。
 *
 * Calendar代表了系统此刻日期对应的日历对象。
 * Calendar是一个抽象类，不能直接创建对象。
 *  Calendar rightNow = Calendar.getInstance();
 * Calendar的方法：
 *  1.public static Calendar getInstance(); 返回一个日历类的对象。
 *  2.public int get(int field); 取日期中的某个字段信息。
 *  3.public void set(int field, int value); 修改日历的某个字段信息。
 *  4.public void add(int field, int amount); 为某个字段增加/减少指定的值。
 *  5.public final Date getTime(); 拿到此刻日期对象。
 *  6.public long getTimeInMillis(); 拿到此刻时间毫秒值。
 */
public class CalendarDemo01 {
    public static void main(String[] args) {
        // 1.通过调用日历类的静态方法getInstance得到一个当前此刻日期对象对应的日历对象。
        Calendar rightNow = Calendar.getInstance();
        System.out.println(rightNow);

        // 2.获取年
        int year = rightNow.get(Calendar.YEAR);
        System.out.println(year);

        int month = rightNow.get(Calendar.MONTH) + 1;
        System.out.println(month);

        // 3.一年中的第几天：
        int days = rightNow.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        // 4.修改日历的信息
        rightNow.set(Calendar.YEAR, 2099);
        System.out.println(rightNow.get(Calendar.YEAR));

        rightNow.set(Calendar.HOUR, 12);
        System.out.println(rightNow.get(Calendar.YEAR));

        // 5.日历可以得到此刻日期对象。
        Date time = rightNow.getTime();
        System.out.println(time);

        // 6.此刻时间毫秒值
        long time1 = rightNow.getTimeInMillis();

        // 7.1请问71天后是哪个日期
        rightNow.add(Calendar.DAY_OF_YEAR, 71);
        Date time2 = rightNow.getTime();
        System.out.println(time2);
        System.out.println(rightNow.get(Calendar.YEAR));

        // 7.2请问701天后是哪个日期
        rightNow.add(Calendar.DAY_OF_YEAR, 701);
        rightNow.add(Calendar.HOUR, 4);
        rightNow.add(Calendar.MINUTE, 5);
        rightNow.add(Calendar.SECOND, 12);
        System.out.println(rightNow.get(Calendar.YEAR));
    }
}
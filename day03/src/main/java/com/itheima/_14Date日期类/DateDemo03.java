package com.itheima._14Date日期类;

import java.util.Date;

/**
 * 目标：Date类的有参构造器的使用。
 *
 * 构造器：
 *      -- public Date();创建当前系统此刻的日期时间对象
 *      -- public Date(long time);把时间毫秒值转换成日期对象
 *
 * 流程：
 *      Date日期对象 -> getTime -> 时间毫秒值
 *      时间毫秒值 -> new Date(时间毫秒值) -> Date日期对象
 *
 * 小结：时间戳转Date对象
 */
public class DateDemo03 {
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime() + 121000;
        Date date2 = new Date(time);
        System.out.println(date2);
    }
}

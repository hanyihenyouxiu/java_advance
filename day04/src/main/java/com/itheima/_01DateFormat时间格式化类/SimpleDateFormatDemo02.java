package com.itheima._01DateFormat时间格式化类;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 目标日期格式化类SimpleDateFormat解析字符串时间成为日期对象。
 *
 * 引入：
 *  Date日期对象 -> 格式化成 -> 喜欢的字符串时间格式
 *  时间毫秒值 -> 格式化成 ->喜欢的字符串时间形式 √
 *  字符串的时间形式 -> 解析成 -> Date日期对象。
 */
public class SimpleDateFormatDemo02 {
    public static void main(String[] args) {
        // 直接格式化时间毫秒值
        Date date = new Date();
        long time = date.getTime() + 121000;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = simpleDateFormat.format(time);
        System.out.println(format);
    }
}

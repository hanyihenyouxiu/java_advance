package com.hanyi._01DateFormat时间格式化类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 目标日期格式化类SimpleDateFormat解析字符串时间成为日期对象。
 *
 * 引入：
 *  Date日期对象 -> 格式化成 -> 喜欢的字符串时间格式
 *  时间毫秒值 -> 格式化成 ->喜欢的字符串时间形式
 *  字符串的时间形式 -> 解析成 -> Date日期对象。 √
 */
public class SimpleDateFormatDemo03 {
    public static void main(String[] args) throws ParseException {
        // 日期字符串
        String date = "2019-11-04 09:30:30";
        //把字符串解析成Date
        // 注意：参数必须与被解析时间的格式完全一致，否则会报错！
        Date parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date);
        // 毫秒值运算
        long time = parse.getTime() + 123000;
        Date date1 = new Date(time);
        System.out.println(date1);
    }
}

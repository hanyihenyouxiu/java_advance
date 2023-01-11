package com.hanyi._07正则表达式的演示;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 拓展：正则表达式爬取信息中的内容
 */
public class RegexDemo05 {
    public static void main(String[] args) {
        String rs = "电话123109打的sad2额的撒啊实打实的3425324324阿萨德全文期望的哈萨克的骄傲15097646868是来看待阿斯顿就h150976464877i怄气温和";
        // 爬电话
        String regex = "\\w{1,}@\\{2,10}(\\.\\w{2,10}){1,2}|0\\d{2,5}-?\\d{5,15}";
        // 编译一个正则表达式称为一个匹配规则对象
        Pattern pattern = Pattern.compile(regex);
        // 通过匹配规则对象得到一个匹配数据内容
        Matcher matcher = pattern.matcher(rs);
        // 通过匹配器获取内容
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

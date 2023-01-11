package com.hanyi._07正则表达式的演示;

/**
 * 目标：正则表达式在方法中的应用。
 *
 * public String[] split(String regex);
 *      -- 按照正则表达式匹配的内容进行分割字符串，返回一个字符串数组。
 * public String replaceAll(String regex, String newStr);
 *      -- 按照正则表达式匹配的内容进行替换。
 */
public class RegexDemo04 {
    public static void main(String[] args) {
        // 1.split的基础用法
        String name = "贾乃亮，王宝强，陈羽凡";
        String[] nameArrs = name.split(",");
        for (int i = 0; i < nameArrs.length; i++) {
            System.out.println(nameArrs[i]);
        }

        String names = "贾乃亮123王宝强32154陈羽凡";
        String[] nameArrs1 = names.split("\\w+");
        for (int i = 0; i < nameArrs1.length; i++) {
            System.out.println(nameArrs1[i]);
        }
    }
}

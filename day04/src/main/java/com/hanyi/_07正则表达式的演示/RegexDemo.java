package com.hanyi._07正则表达式的演示;

/**
 * 目标：正则表达式的演示
 *
 * 正则表达式的作用：
 *  是一些特殊字符组成的校验规则，可以校验信息的正确性，校验邮箱是否合法，电话号码，金额等。
 *
 * 需求：演示不用正则表达式和用正则表达式校验qq号码。
 */
public class RegexDemo {
    public static void main(String[] args) {
        System.out.println("32321431");
    }

    // 不用正则表达式
    public static boolean checkQQ(String args) {
        if (args == null) {
            return false;
        } else {
            if (args.length() >= 4) {
                boolean rs = true;
                for (int i = 0; i < args.length(); i++) {
                    char ch = args.charAt(i);
                    if (ch < '0' || ch > '9') {
                        rs = false;
                    }
                }
                return rs;
            } else {
                return false;
            }
        }
    }

    // 使用正则表达式
    public static boolean checkQQRegex(String qq) {
        return qq != null && qq.matches("\\d{4,}");
    }
}
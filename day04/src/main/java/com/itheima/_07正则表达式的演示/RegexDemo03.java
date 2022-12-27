package com.itheima._07正则表达式的演示;

import java.util.Scanner;

/**
 * 目标：正则表达式的实际应用
 *
 * 0203433535
 * 020-4343234234
 */
public class RegexDemo03 {
    public static void main(String[] args) {
        // 校验邮箱

    }

    // 验证座机号
    private static void checkPhone() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的座机号！");
        String phone = scanner.nextLine();
        if (phone.matches("0\\d{2,5}-?\\d{5,15}")) {
            System.out.println("手机号没问题！");
        } else {
            System.out.println("手机号不合法！");
        }
    }

    // 校验手机号
    private static void checkTel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的手机号！");
        String tel = scanner.nextLine();
        if (tel.matches("1[3-9]\\d{8}")) {
            System.out.println("手机号没问题");
        } else {
            System.out.println("手机号不正确！");
        }
    }

    // 校验邮箱
    public static void checkEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入邮箱！");
        String email = scanner.nextLine();
        if (email.matches("\\w{1,}@\\{2,10}(\\.\\w{2,10}){1,2}")) {
            System.out.println("邮件合法了");
        } else {
            System.out.println("邮件格式不正确！");
        }
    }
}

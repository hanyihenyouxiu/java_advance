package com.hanyi._13代码块;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标：静态代码块研究。
 *
 * 类有五大成分：成员变量，方法，构造器，代码块，内部类
 *
 * 代码块按照有无static修饰可以分为：静态代码块，实例代码块。
 *
 * (1)静态代码块：
 *  格式：static {
 *
 *  }
 *  --必修用static修饰。属于类，会与类一起加载，而且会自动触发执行一次！
 *  --静态代码块可以用于在执行类的方法之前进行静态资源的初始化操作。
 *  小结：
 *      静态代码块数据类的成员，应该有static修饰。属于类，会与类一起优先加载，而且自动触发执行。
 *      静态代码块可以用于在执行类的方法之前进行静态资源的初始化操作。
 */
public class CodeDemo01 {
    static List<String> cards = new ArrayList<>();

    static {
        System.out.println("静态代码块------");
        // 静态代码块可以用于在执行类的方法之前进行静态资源的初始化操作
        cards.add("红心3");
        cards.add("黑桃3");
    }

    public static void main(String[] args) {
        System.out.println("main方法执行喽");
    }
}

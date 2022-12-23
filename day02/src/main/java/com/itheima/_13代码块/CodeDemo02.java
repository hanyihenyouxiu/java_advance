package com.itheima._13代码块;

/**
 * 目标：实例代码块
 * (2)实例代码块
 *  格式：{}
 *   -- 必须无static修饰。属于类的每个对象的，会与类的每个对象一起加载，每次创建对象的时候，实例代码块就会触发执行一次。
 *   -- 实例代码块可以用于初始化实力资源
 */
public class CodeDemo02 {

    {
        System.out.println("实例代码块·---");
    }

    public static void main(String[] args) {
        CodeDemo02 c1 = new CodeDemo02();
        System.out.println("main方法执行喽！");
    }
}

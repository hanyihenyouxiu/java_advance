package com.itheima._08内部类_实例内部类;

/**
 * 目标：内部类_实例内部类（成员内部类）
 *
 * 什么是实例内部类：
 *  无static修饰的内部类，属于外部类的每个对象的，与对象一起加载的。
 *
 * 实例内部类的成员特点：
 *  实例内部类中不能定义静态成员，其他都可以定义。
 *  可以定义常量
 *
 * 成员内部类访问格式：
 *  外部类名称.内部类名称
 *
 * 创建对象的格式
 *  外部类名称，内部类名称 对象名 = new 外部类构造器.new 内部类构造器；
 *
 * 实例内部类的访问扩展：
 *  实例内部类中是否可以直接访问外部类的静态成员？
 *
 */
public class InnerClass {
}

// 外部类
class Outer {

    // 内部类
    public static class Inner {

        private String name;

        private void show() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

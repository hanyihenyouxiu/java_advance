package com.itheima._15单例设计模式;

/**
 *2、懒汉式单例设计模式：
 *      -- 通过类获取单例对象的时候发现没有对象才会去创建一个对象。
 *      -- 实现步骤：
 *          1.定义一个单例类。
 *          2.把类的构造器私有。
 *          3.定义一个静态成员变量用于存储一个对象！
 *          （饿汉单例再返回对象的时候，对象要已经做好，所以这里直接创建出来。）
 *          4.定义一个方法返回单例对象,可以判断对象是否存在。
 */
public class SingleInstanceDemo02 {
    public static void main(String[] args) {

    }
}

// 懒汉式单例设计模式
class SingleInstance02 {
    public static SingleInstance02 instance02;

    private SingleInstance02() {

    }

    public static SingleInstance02 getInstance02() {
        if (instance02 == null) {
            instance02 = new SingleInstance02();
        }
        return instance02;
    }
}
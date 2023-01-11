package com.hanyi._15单例设计模式;

/**
 * 目标：单例设计模式
 *
 * 什么是单例？
 *  单例的意思是一个类永远只存在一个对象，不能创建多个对象。
 * 为什么要用单例？
 *  开发中很多类的对象我们只需要一个，例如虚拟机对象！任务管理器对象！
 *  对象越多越占内存，有些时候只需要一个对象就可以实现业务，单例可以节约内存，提高性能！
 * 如何实现单例？
 *  单例的实现方式目前有两种方式。
 *  1、饿汉式单例设计模式：
 *      -- 通过类获取单例对象的时候，对象已经提前做好了！
 *      -- 实现步骤：
 *          1.定义一个单例类。
 *          2.把类的构造器私有。
 *          3.定义一个静态成员变量用于存储一个对象。
 *              （饿汉单例在返回对象的时候，对象要已经做好，所以这里直接创建出来了！）
 *          4.定义一个方法返回单例对象
 */
public class SingleInstanceDemo01 {
    public static void main(String[] args) {
        SingleInstance instance = SingleInstance.getInstance();
    }
}

// 饿汉式单例设计模式
class SingleInstance {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static SingleInstance singleInstance = new SingleInstance();

    private SingleInstance() {

    }

    public static SingleInstance getInstance() {
        return singleInstance;
    }
}

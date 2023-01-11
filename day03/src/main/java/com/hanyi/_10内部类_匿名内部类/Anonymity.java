package com.hanyi._10内部类_匿名内部类;

/**
 * 目标：匿名内部类的概述
 *
 * 什么是匿名内部类？
 *  就是一个没有名字的局部内部类
 *  匿名内部类目的是为了：简化代码，也是开发中常用的格式。
 *
 * 匿名内部类的格式：
 *  new 类名|抽象类|接口(形参){
 *      方法重写。
 *  }
 *
 * 匿名内部类的特点：
 *  1.匿名内部类是一个没有名字的内部类。
 *  2.匿名内部类一旦写出来，就会立即创建一个匿名内部类的对象返回。
 *  3.匿名内部类的对象的类型相当于是当前new的那个的类型的子类类型。
 *
 * 小结：
 *  1.匿名内部类是一个没有名字的内部类。
 *  2.匿名内部类一旦写出来，就会立即创建一个匿名内部类的对象返回。
 *  3.匿名内部类的对象的类型相当于是当前new的那个的类型的子类类型。
 *  外部类名$1.class
 *  外部类名$2.class
 */
public class Anonymity {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void run() {
                System.out.println("猫跑的贼快~~");
            }
        };
        animal.run();
        animal.go();
        Animal animal1 = new Animal() {
            @Override
            public void run() {
                System.out.println("狗跑的飞快！");
            }
        };
        animal1.run();
    }
}

//class Cat extends Animal{
//
//    @Override
//    public void run() {
//        System.out.println("猫跑的贼快！");
//    }
//}

abstract class Animal{
    public abstract void run();

    public void go() {
        System.out.println("开始跑啊");
    }
}

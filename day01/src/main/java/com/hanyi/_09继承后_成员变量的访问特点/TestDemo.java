package com.hanyi._09继承后_成员变量的访问特点;

/**
 * 成员变量的访问特点：
 * <p>
 * 就近原则：
 *  子类有就找子类，子类没有就找父类，父类没有就报错。
 *
 * 小结：
 *  this代表了当前对象的引用，可以用于访问当前子类对象的成员变量。
 *  super代表了父类对象的引用，可以用于访问父类的成员变量。
 */
public class TestDemo {
    public static void main(String[] args) {

    }
}

class Animal {
    public String name = "动物名称";
}

class Cat extends Animal {
    //public String name = "子类名称";
    public void show() {
        //public String name = "局部名称";
        System.out.println(name);
    }
}
